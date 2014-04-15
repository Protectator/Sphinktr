package ch.protectator.sphinktr;

import java.util.ArrayList;

/**
 * Represents a list of Units
 * 
 * @author Kewin Dousse
 */
public class Army {

	private ArrayList<Unit> units;

	/**
	 * @return the units
	 */
	public ArrayList<Unit> getUnits() {
		return units;
	}
	
	/**
	 * @return a random unit with equivalent probabilities
	 */
	public Unit getRandomUnit() {
		return units.get(Simulation.getInstance().randomizer.nextInt(this.units.size()));
	}

	public Army(ArrayList<Unit> units) {
		this.units = units;
	}
	
}
