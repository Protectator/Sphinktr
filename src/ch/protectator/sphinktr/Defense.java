package ch.protectator.sphinktr;

/**
 * Represents the different Defense buildings types
 * 
 * @author Kewin Dousse
 */
public enum Defense implements Unit {
	ROCKETLAUNCHER("Lanceur de missiles", 2000, 20, 80),
	LIGHTLASER("Artillerie laser légère", 2000, 25, 100),
	HEAVYLASER("Artillerie laser lourde", 8000, 100, 250),
	GAUSSCANNON("Canon de Gauss", 35000, 200, 1100),
	IONCANNON("Artillerie à Ions", 8000, 500, 150),
	PLASMATURRET("Lanceur de plasma", 100000, 300, 3000),
	SMALLSHIELDDOME("Petit bouclier", 20000, 2000, 1),
	LARGESHIELDDOME("Grand bouclier", 100000, 10000, 1),
	ANTIBALLISTICMISSILES("Missile d'interception", 8000, 1, 1),
	INTERPLANETARYMISSILES("Missiles interplanétaires", 15000, 1, 12000);
	
	private final String name;
	private final int structure;
	private final int shield;
	private final int attack;
	
	/**
	 * @param name	Full name of the Defense building
	 */
	Defense(String name, int structure, int shield, int attack) {
		this.name = name;
		this.structure = structure;
		this.shield = shield;
		this.attack = attack;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the structure
	 */
	public int getStructure() {
		return structure;
	}

	/**
	 * @return the shield
	 */
	public int getShield() {
		return shield;
	}

	/**
	 * @return the attack
	 */
	public int getAttack() {
		return attack;
	}

	/**
	 * @return the rapidFire
	 */
	public int getRapidfire(Unit unit) {
		return 1; // Defenses doesn't have Rapidfire against anyone.
	}

}
