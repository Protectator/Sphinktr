package ch.protectator.sphinktr;

/**
 * Represents a Player
 * 
 * @author Kewin Dousse
 */
public class Player {

	private Army army;

	/**
	 * @param army
	 */
	public Player(Army army) {
		this.army = army;
	}

	/**
	 * @return the army
	 */
	public Army getArmy() {
		return army;
	}
	
}