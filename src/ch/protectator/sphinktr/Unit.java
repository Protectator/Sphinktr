package ch.protectator.sphinktr;

/**
 * Represents a fighting Unit
 * 
 * @author Kewin Dousse
 */
public class Unit implements Fighting, UnitType {

	private UnitType type;
	private int currentHp;
	private int currentShield;
	
	/**
	 * @param type	Type of the Unit. Cannot be changed later.
	 */
	public Unit(UnitType type) {
		super();
		this.type = type;
		this.currentHp = type.getStructure()/10;
		this.currentShield = type.getShield();
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
			int rapidFire = type.getRapidfire(target);
			if (rapidFire != 1) {
				if (Simulation.getInstance().randomizer.nextInt(rapidFire) == 0) {
					shouldAttack = true;
				}
			}
		}
	}
	
	/**
	 * @param defender	Unit to attack.
	 */
	public void attackUnit(Unit defender) {
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

	@Override
	public int getCurrentHp() {
		return currentHp;
	}

	@Override
	public int getCurrentShield() {
		return currentShield;
	}

	@Override
	public String getName() {
		return type.getName();
	}

	@Override
	public int getStructure() {
		return type.getStructure();
	}

	@Override
	public int getAttack() {
		return type.getAttack();
	}

	@Override
	public int getShield() {
		return type.getShield();
	}

	@Override
	public int getRapidfire(UnitType unit) {
		return type.getRapidfire(unit);
	}
	
}
