package ch.protectator.sphinktr;

/**
 * Represents the different existing Resources
 * 
 * @author Kewin Dousse
 */
public enum Resource {
	METAL("Metal", 1),
	CRYSTAL("Cristal", 2),
	DEUTERIUM("Deuterium", 3);

	private String name;
	private int value;
	
	/**
	 * @param name	Full name
	 * @param value	Proportionally relative value
	 */
	Resource(String name, int value) {
		this.name = name;
		this.value = value;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the value
	 */
	public int getValue() {
		return value;
	}

}
