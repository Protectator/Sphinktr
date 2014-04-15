package ch.protectator.sphinktr;

/**
 * Represents a Battle between Players
 * 
 * @author Kewin Dousse
 */
public class Battle {
	
	private Player attacker;
	private Player defender;
	
	public static int nbTurns = 20;
	
	/**
	 * @param attacker
	 * @param defender
	 */
	public Battle(Player attacker, Player defender) {
		this.attacker = attacker;
		this.defender = defender;
	}
	
	public void run() {
		for (int turn = 1; turn <= Battle.nbTurns; turn++) {
			System.out.println("===== New Turn (" + turn + ") =====");
			turn();
			
			if (attacker.getArmy().getUnits().isEmpty()) {
				if (defender.getArmy().getUnits().isEmpty()) {
					System.out.println("The two armies are completely destroyed. Nothing happens...");
					return;
				}
				System.out.println("The attacking army is completely destroyed : The Defender wins after " + turn + " turns.");
				return;
			}
			if (defender.getArmy().getUnits().isEmpty()) {
				System.out.println("The defending army is completely destroyed : The Attacker wins after " + turn + " turns.");
				return;
			}
			System.out.println();
		}
		System.out.println("The defending army is still alive after " + Battle.nbTurns + " turns. The attacker retires...");
		return;
	}
	
	public void turn() {
		// TODO : Code pas propre, à améliorer
		// TODO : Utiliser des listes au lieu de ArrayList, par exemple...
		int attackerArmySize = attacker.getArmy().getUnits().size();
		for (int currentUnitNumber = 0; currentUnitNumber < attackerArmySize; currentUnitNumber++) {
			Unit currentUnit = attacker.getArmy().getUnits().get(currentUnitNumber);
			currentUnit.attackTurn(defender.getArmy());
		}
		
		int defenderArmySize = defender.getArmy().getUnits().size();
		for (int currentUnitNumber = 0; currentUnitNumber < defenderArmySize; currentUnitNumber++) {
			Unit currentUnit = defender.getArmy().getUnits().get(currentUnitNumber);
			currentUnit.attackTurn(attacker.getArmy());
		}
		
		System.out.println("=== Attaquant ===");
		
		for (int currentUnit = 0; currentUnit < attackerArmySize; currentUnit++) {
			Unit current = attacker.getArmy().getUnits().get(currentUnit).endTurn();
			if (current == null) {
				attacker.getArmy().getUnits().remove(currentUnit);
				currentUnit--; // TODO : Code vomitif. à rework si possible. Vraiment.
				attackerArmySize--;
			}
		}
		
		System.out.println("=== Défenseur ===");
		
		for (int currentUnit = 0; currentUnit < defenderArmySize; currentUnit++) {
			Unit current = defender.getArmy().getUnits().get(currentUnit).endTurn();
			if (current == null) {
				defender.getArmy().getUnits().remove(currentUnit);
				currentUnit--;
				defenderArmySize--;
			}
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
