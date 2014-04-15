package ch.protectator.sphinktr;

/**
 * Represents a Battle between Players
 * 
 * @author Kewin Dousse
 */
public class Battle {
	
	private Player attacker;
	private Player defender;
	
	/**
	 * @param attacker
	 * @param defender
	 */
	public Battle(Player attacker, Player defender) {
		this.attacker = attacker;
		this.defender = defender;
	}
	
	public void run() {
		for (int turn = 1; turn <= 6; turn++) {
			System.out.println("===== New Turn (" + turn + ") =====");
			turn();
			
			if (attacker.getArmy().getUnits().isEmpty()) {
				if (defender.getArmy().getUnits().isEmpty()) {
					System.out.println("Les deux arm�es sont d�truites (???)");
				}
				System.out.println("Le d�fenseur gagne la bataille");
			}
			if (defender.getArmy().getUnits().isEmpty()) {
				System.out.println("L'attaquand gagne la bataille.");
			}
		}
		System.out.println("Le combat est termin�, l'attaquant se retire.");
	}
	
	public void turn() {
		int attackerArmySize = attacker.getArmy().getUnits().size();
		for (int currentUnit = 0; currentUnit < attackerArmySize; currentUnit++) {
			attacker.getArmy().getUnits().get(currentUnit).attackTurn(defender.getArmy());
		}
		int defenderArmySize = defender.getArmy().getUnits().size();
		for (int currentUnit = 0; currentUnit < defenderArmySize; currentUnit++) {
			defender.getArmy().getUnits().get(currentUnit).attackTurn(attacker.getArmy());
		}
		
		for (int currentUnit = 0; currentUnit < attackerArmySize; currentUnit++) {
			Unit current = attacker.getArmy().getUnits().get(currentUnit);
			attacker.getArmy().getUnits().set(currentUnit, current.endTurn());
		}
		for (int currentUnit = 0; currentUnit < defenderArmySize; currentUnit++) {
			Unit current = defender.getArmy().getUnits().get(currentUnit);
			defender.getArmy().getUnits().set(currentUnit, current.endTurn());
		}
	}

	/**
	 * @return the attacker
	 */
	public Player getAttacker() {
		return attacker;
	}

	/**
	 * @return the defender
	 */
	public Player getDefender() {
		return defender;
	}

}
