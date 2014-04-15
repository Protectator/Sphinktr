package ch.protectator.sphinktr;

import java.util.HashMap;

/**
 * Represents the different Ship types
 * 
 * @author Kewin Dousse
 */
@SuppressWarnings("serial")
public enum Ship implements UnitType {
	LIGHTFIGHTER("Chasseur léger", 4000, 10, 50,
			new HashMap<UnitType, Integer>() {{
			    put(Ship.ESPIONAGEPROBE, 5);
			    put(Ship.SOLARSATELLITE, 5);
			}}),
			
	HEAVYFIGHTER("Chasseur lourd", 10000, 25, 150,
			new HashMap<UnitType, Integer>() {{
				put(Ship.SMALLCARGO, 5);
			    put(Ship.ESPIONAGEPROBE, 5);
			    put(Ship.SOLARSATELLITE, 5);
			}}),
			
	CRUISER("Croiseur", 27000, 50, 400,
			new HashMap<UnitType, Integer>() {{
				put(Ship.LIGHTFIGHTER, 6);
			    put(Ship.ESPIONAGEPROBE, 5);
			    put(Ship.SOLARSATELLITE, 5);
			    put(Defense.ROCKETLAUNCHER, 5);
			}}),
			
	BATTLESHIP("Vaisseau de bataille", 60000, 20, 1000,
			new HashMap<UnitType, Integer>() {{
			    put(Ship.ESPIONAGEPROBE, 5);
			    put(Ship.SOLARSATELLITE, 5);
			}}),
			
	BATTLECRUISER("Traqueur", 70000, 400, 700,
			new HashMap<UnitType, Integer>() {{
				put(Ship.SMALLCARGO, 3);
				put(Ship.LARGECARGO, 3);
				put(Ship.HEAVYFIGHTER, 4);
				put(Ship.CRUISER, 4);
				put(Ship.BATTLESHIP, 7);
			    put(Ship.ESPIONAGEPROBE, 5);
			    put(Ship.SOLARSATELLITE, 5);
			}}),
			
	BOMBER("Bombardier", 75000, 500, 1000,
			new HashMap<UnitType, Integer>() {{
				put(Defense.ROCKETLAUNCHER, 20);
				put(Defense.LIGHTLASER, 20);
				put(Defense.HEAVYLASER, 10);
				put(Defense.IONCANNON, 10);
			    put(Ship.ESPIONAGEPROBE, 5);
			    put(Ship.SOLARSATELLITE, 5);
			}}),
			
	DESTROYER("Destructeur", 110000, 500, 2000,
			new HashMap<UnitType, Integer>() {{
				put(Ship.BATTLECRUISER, 2);
				put(Defense.LIGHTLASER, 20);
			    put(Ship.ESPIONAGEPROBE, 5);
			    put(Ship.SOLARSATELLITE, 5);
			}}),
			
	DEATHSTAR("Etoile de la mort", 9000000, 50000, 200000,
			new HashMap<UnitType, Integer>() {{
				put(Ship.SMALLCARGO, 250);
				put(Ship.LARGECARGO, 250);
				put(Ship.LIGHTFIGHTER, 200);
				put(Ship.HEAVYFIGHTER, 100);
				put(Ship.CRUISER, 33);
				put(Ship.BATTLESHIP, 30);
				put(Ship.COLONYSHIP, 250);
				put(Ship.RECYCLER, 250);
				put(Ship.ESPIONAGEPROBE, 1250);
				put(Ship.SOLARSATELLITE, 1250);
				put(Ship.BOMBER, 25);
				put(Ship.DESTROYER, 5);
				put(Defense.ROCKETLAUNCHER, 200);
				put(Defense.LIGHTLASER, 200);
				put(Defense.HEAVYLASER, 100);
				put(Defense.GAUSSCANNON, 50);
				put(Defense.IONCANNON, 100);
				put(Ship.BATTLECRUISER, 200);
			}}),
			
	SMALLCARGO("Petit transporteur", 4000, 10, 5,
			new HashMap<UnitType, Integer>() {{
			    put(Ship.ESPIONAGEPROBE, 5);
			    put(Ship.SOLARSATELLITE, 5);
			}}),
			
	LARGECARGO("Grand transporteur", 12000, 25, 5,
			new HashMap<UnitType, Integer>() {{
			    put(Ship.ESPIONAGEPROBE, 5);
			    put(Ship.SOLARSATELLITE, 5);
			}}),
			
	COLONYSHIP("Vaisseau de colonisation", 30000, 100, 50,
			new HashMap<UnitType, Integer>() {{
			    put(Ship.ESPIONAGEPROBE, 5);
			    put(Ship.SOLARSATELLITE, 5);
			}}),
			
	RECYCLER("Recycleur", 16000, 10, 1,
			new HashMap<UnitType, Integer>() {{
			    put(Ship.ESPIONAGEPROBE, 5);
			    put(Ship.SOLARSATELLITE, 5);
			}}),
			
	ESPIONAGEPROBE("Sonde d'espionnage", 1000, 0, 0,
			new HashMap<UnitType, Integer>() {{
			}}),
			
	SOLARSATELLITE("Satellite solaire", 2000, 1, 1,
			new HashMap<UnitType, Integer>() {{
			}});
	
	private final String name;
	private final int structure;
	private final int shield;
	private final int attack;
	private HashMap<UnitType, Integer> rapidfires;
	
	/**
	 * @param name	Full name of the Ship
	 */
	Ship(String name, int structure, int shield, int attack, HashMap<UnitType, Integer> rapidfire) {
		this.name = name;
		this.structure = structure;
		this.shield = shield;
		this.attack = attack;
		this.rapidfires = rapidfire;
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
	public int getRapidfire(UnitType unit) {
		if (this.rapidfires.containsKey(unit)) {
			return this.rapidfires.get(unit);
		}
		return 1;
	}
	
}
