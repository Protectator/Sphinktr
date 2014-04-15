package ch.protectator.sphinktr;

import java.util.ArrayList;
import java.util.Random;

/**
 * Represents a set of Battles
 * 
 * @author Kewin Dousse
 */
public class Simulation {
	
	public Random randomizer;
	public Battle currentBattle;
	
	/* Singleton */
	private Simulation(){
		randomizer = new Random();
	}
	private static Simulation INSTANCE = new Simulation();
	public static Simulation getInstance() {
		return INSTANCE;
	}
	/* End of Singleton */

	public static void main(String[] args) {
		// Test
		ArrayList<Unit> visitors = new ArrayList<Unit>();
		ArrayList<Unit> locals = new ArrayList<Unit>();
		
		visitors.add(new Unit(Ship.BOMBER));
		locals.add(new Unit(Defense.PLASMATURRET));
		
		Army attack = new Army(visitors);
		Army defense = new Army(locals);
		Player attacking = new Player(attack);
		Player defending = new Player(defense);
		// No more test
		
		Battle currentBattle = new Battle(attacking, defending);
		currentBattle.run();
	}

	/**
	 * @return the currentBattle
	 */
	public Battle getCurrentBattle() {
		return currentBattle;
	}

	/**
	 * @param currentBattle the currentBattle to set
	 */
	public void setCurrentBattle(Battle currentBattle) {
		this.currentBattle = currentBattle;
	}

}
