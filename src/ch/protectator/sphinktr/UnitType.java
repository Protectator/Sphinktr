package ch.protectator.sphinktr;

/**
 * Represents a type of fighting Unit
 * 
 * @author Kewin Dousse
 */
public interface UnitType {

	public String getName();
	public int getStructure();
	public int getAttack();
	public int getShield();
	public int getRapidfire(UnitType unit);
	
}
