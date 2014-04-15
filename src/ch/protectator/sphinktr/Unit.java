package ch.protectator.sphinktr;

/**
 * Represents a fighting Unit
 * 
 * @author Kewin Dousse
 */
public class Unit implements UnitType {

	private UnitType type;

	@Override
	public String getName() {
		return type.getName();
	}

	@Override
	public int getStructure() {
		return type.getStructure();
	}

	@Override
	public int getAttack() {
		return type.getAttack();
	}

	@Override
	public int getShield() {
		return type.getShield();
	}

	@Override
	public int getRapidfire(UnitType unit) {
		return type.getRapidfire(unit);
	}
	
}
