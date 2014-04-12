package ch.protectator.sphinktr;

import java.util.HashMap;

/**
 * Represents the different Defense buildings types
 * 
 * @author Kewin Dousse
 */
public enum Defense implements Unit {
	ROCKETLAUNCHER("Lanceur de missiles", 0, 0, 0),
	LIGHTLASER("Artillerie laser légère", 0, 0, 0),
	HEAVYLASER("Artillerie laser lourde", 0, 0, 0),
	GAUSSCANNON("Canon de Gauss", 0, 0, 0),
	IONCANNON("Artillerie à Ions", 0, 0, 0),
	PLASMATURRET("Lanceur de plasma", 0, 0, 0),
	SMALLSHIELDDOME("Petit bouclier", 0, 0, 0),
	LARGESHIELDDOME("Grand bouclier", 0, 0, 0),
	ANTIBALLISTICMISSILES("Missile d'interception", 0, 0, 0),
	INTERPLANETARYMISSILES("Missiles interplanétaires", 0, 0, 0);
	
	private final String name;
	private final int structure;
	private final int shield;
	private final int attack;
	private HashMap<Unit, Integer> rapidFire;
	
	/**
	 * @param name	Full name of the Defense building
	 */
	Defense(String name, int structure, int shield, int attack) {
		this.name = name;
		this.structure = structure;
		this.shield = shield;
		this.attack = attack;
		// TODO : Set the RapidFire
	}
	
	
	/**
	 * @param rapidFire the rapidFire to set
	 */
	public void setRapidFire(HashMap<Unit, Integer> rapidFire) {
		this.rapidFire = rapidFire;
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
	public HashMap<Unit, Integer> getRapidFire() {
		return rapidFire;
	}

}
