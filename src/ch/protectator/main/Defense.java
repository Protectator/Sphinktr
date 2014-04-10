package ch.protectator.main;

/**
 * Represents the different Defense buildings types
 * 
 * @author Kewin Dousse
 */
public enum Defense implements Unit {
	ROCKETLAUNCHER("Lanceur de missiles"),
	LIGHTLASER("Artillerie laser l�g�re"),
	HEAVYLASER("Artillerie laser lourde"),
	GAUSSCANNON("Canon de Gauss"),
	IONCANNON("Artillerie � Ions"),
	PLASMATURRET("Lanceur de plasma"),
	SMALLSHIELDDOME("Petit bouclier"),
	LARGESHIELDDOME("Grand bouclier"),
	ANTIBALLISTICMISSILES("Missile d'interception"),
	INTERPLANETARYMISSILES("Missiles interplan�taires");
	
	private final String name;
	
	/**
	 * @param name	Full name of the Defense building
	 */
	Defense(String name) {
		this.name = name;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

}
