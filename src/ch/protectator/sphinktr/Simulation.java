package ch.protectator.sphinktr;

/**
 * Represents a set of Battles
 * 
 * @author Kewin Dousse
 */
public class Simulation {
	
	/* Singleton */
	private Simulation(){} // 
	private static Simulation INSTANCE = new Simulation();
	public static Simulation getInstance() {
		return INSTANCE;
	}
	/* End of Singleton */

	public static void main(String[] args) {
		// TODO Temporary main while one Simulation makes sense
	}

}
