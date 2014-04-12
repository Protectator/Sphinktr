package ch.protectator.sphinktr;

import java.util.HashMap;

/**
 * Represents a fighting Unit
 * 
 * @author Kewin Dousse
 */
public interface Unit {

	public String getName();
	public int getStructure();
	public int getAttack();
	public int getShield();
	public HashMap<Unit, Integer> getRapidFire();
	
}
