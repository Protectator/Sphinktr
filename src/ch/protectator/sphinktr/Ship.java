package ch.protectator.sphinktr;

import java.util.HashMap;

/**
 * Represents the different Ship types
 * 
 * @author Kewin Dousse
 */
public enum Ship implements Unit {
	LIGHTFIGHTER("Chasseur léger", 4000, 10, 50),
	HEAVYFIGHTER("Chasseur lourd", 10000, 25, 150),
	CRUISER("Croiseur", 27000, 50, 400),
	BATTLESHIP("Vaisseau de bataille", 60000, 20, 1000),
	BATTLECRUISER("Traqueur", 70000, 400, 700),
	BOMBER("Bombardier", 75000, 500, 1000),
	DESTROYER("Destructeur", 110000, 500, 2000),
	DEATHSTAR("Etoile de la mort", 9000000, 50000, 200000),
	SMALLCARGO("Petit transporteur", 4000, 10, 5),
	LARGECARGO("Grand transporteur", 12000, 25, 5),
	COLONYSHIP("Vaisseau de colonisation", 30000, 100, 50),
	RECYCLER("Recycleur", 16000, 10, 1),
	ESPIONAGEPROBE("Sonde d'espionnage", 1000, 0, 0),
	SOLARSATELLITE("Satellite solaire", 2000, 1, 1);
	
	private final String name;
	private final int structure;
	private final int shield;
	private final int attack;
	private HashMap<Unit, Integer> rapidFire;
	
	/**
	 * @param name	Full name of the Ship
	 */
	Ship(String name, int structure, int shield, int attack) {
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
