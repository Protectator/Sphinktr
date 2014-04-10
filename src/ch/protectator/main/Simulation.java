package ch.protectator.main;

public class Simulation {
	
	/* Singleton */
	private Simulation(){} // Constructeur inaccessible
	private static Simulation INSTANCE = new Simulation();
	public static Simulation getInstance() {
		return INSTANCE;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
