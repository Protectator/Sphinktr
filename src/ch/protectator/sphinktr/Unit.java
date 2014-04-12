package ch.protectator.sphinktr;

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
	public int getRapidfire(Unit unit);
	
}
