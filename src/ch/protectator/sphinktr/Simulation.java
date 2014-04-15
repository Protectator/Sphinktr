package ch.protectator.sphinktr;

import java.util.Random;

/**
 * Represents a set of Battles
 * 
 * @author Kewin Dousse
 */
public class Simulation {
	
	public Random randomizer;
	
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
