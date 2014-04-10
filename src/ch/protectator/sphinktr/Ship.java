package ch.protectator.main;

/**
 * Represents the different Ship types
 * 
 * @author Kewin Dousse
 */
public enum Ship implements Unit {
	LIGHTFIGHTER("Chasseur léger"),
	HEAVYFIGHTER("Chasseur lourd"),
	CRUISER("Croiseur"),
	BATTLESHIP("Vaisseau de bataille"),
	BATTLECRUISER("Traqueur"),
	BOMBER("Bombardier"),
	DESTROYER("Destructeur"),
	DEATHSTAR("Etoile de la mort"),
	SMALLCARGO("Petit transporteur"),
	LARGECARGO("Grand transporteur"),
	COLONYSHIP("Vaisseau de colonisation"),
	RECYCLER("Recycleur"),
	ESPIONAGEPROBE("Sonde d'espionnage"),
	SOLARSATELLITE("Satellite solaire");
	
	private final String name;
	
	/**
	 * @param name	Full name of the Ship
	 */
	Ship(String name) {
		this.name = name;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
}
