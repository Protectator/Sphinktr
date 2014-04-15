package ch.protectator.sphinktr;

/**
 * Represents a fighting Unit
 * 
 * @author Kewin Dousse
 */
public class Unit implements Fighting {

	private UnitType type;
	private int currentHp;
	private int currentShield;
	private int fullHp;
	private String name;
	
	/**
	 * @param type	Type of the Unit. Cannot be changed later.
	 */
	public Unit(UnitType type) {
		super();
		this.type = type;
		this.fullHp = type.getStructure()/10;
		this.currentHp = this.getFullHp();
		this.currentShield = type.getShield();
	}
	
	/**
	 * @param type	Type of the Unit. Cannot be changed later.
	 */
	public Unit(UnitType type, String name) {
		super();
		this.type = type;
		this.fullHp = type.getStructure()/10;
		this.currentHp = this.getFullHp();
		this.currentShield = type.getShield();
		this.name = name;
	}
	
	/**
	 * @param army	Army to attack
	 */
	public void attackTurn(Army army) {
		boolean shouldAttack = true;
		while (shouldAttack) {
			Unit target = army.getRandomUnit();
			attackUnit(target);
			shouldAttack = false;
			int rapidFire = type.getRapidfire(target.getType());
			if (rapidFire != 1) {
				if (Simulation.getInstance().randomizer.nextInt(rapidFire) != 0) {
					System.out.println("... and fires again !");
					shouldAttack = true;
				}
			}
		}
	}
	
	/**
	 * @param defender	Unit to attack.
	 */
	public void attackUnit(Unit defender) {
		System.out.println(this + " attacks " + defender);
		defender.takeDamage(this.getAttack());
	}
	
	/**
	 * @param amount	Amount of damage taken in one blow
	 */
	public void takeDamage(int amount) {
		if (amount * 100 > this.getCurrentShield()) { // If the damage is less than 1% of the shield, it doesn't do anything
			if (amount >= this.getCurrentShield()) {
				setCurrentHp(getCurrentHp() - amount + getCurrentShield());
				setCurrentShield(0);
			} else {
				setCurrentShield(getCurrentShield() - amount);
			}
		}
	}
	
	/**
	 * Does the end of turn mecanisms
	 */
	public Unit endTurn() {
		System.out.println(this);
		System.out.println(Utility.hpBar(getCurrentHp(), getFullHp()));
		if (getCurrentHp() == 0) {
			System.out.println(this + " explodes...");
			return null;
		}
		float percentHp = (float)getCurrentHp() / (float)getFullHp();
		if (percentHp < 0.7) {
			if (Simulation.getInstance().randomizer.nextFloat() > percentHp) {
				System.out.println(this + " explodes...");
				return null;
			}
		}
		this.setCurrentShield(this.type.getShield());
		return this;
	}
	
	@Override
	public String toString() {
		return this.getName() + " ( " + this.getCurrentShield() + "/"+ this.getShield() +" SH | " + this.getCurrentHp() + "/" + this.getFullHp() + " HP )";
	}
	
	/**
	 * @param newHp the currentHp to set
	 */
	public void setCurrentHp(int newHp) {
		this.currentHp = Math.max(0, newHp);
	}

	/**
	 * @param newShield the currentShield to set
	 */
	public void setCurrentShield(int newShield) {
		this.currentShield = Math.max(0, newShield);
	}

	/**
	 * @return the type
	 */
	public UnitType getType() {
		return type;
	}

	@Override
	public int getCurrentHp() {
		return currentHp;
	}

	/**
	 * @return the fullHp
	 */
	public int getFullHp() {
		return fullHp;
	}

	@Override
	public int getCurrentShield() {
		return currentShield;
	}

	public String getName() {
		if (this.name == null) {
			return type.getName();
		} else {
			return this.name;
		}
	}

	public int getStructure() {
		return type.getStructure();
	}

	public int getAttack() {
		return type.getAttack();
	}

	public int getShield() {
		return type.getShield();
	}

	public int getRapidfire(UnitType unit) {
		return type.getRapidfire(unit);
	}
	
}
