package ch.protectator.sphinktr;

import java.util.HashMap;

/**
 * Represents the different Ship types
 * 
 * @author Kewin Dousse
 */
public enum Ship implements Unit {
	LIGHTFIGHTER("Chasseur léger", 4000, 10, 50,
			new HashMap<Unit, Integer>() {
				private static final long serialVersionUID = 7428807739461979509L;
			{
			    put(Ship.ESPIONAGEPROBE, 5);
			    put(Ship.SOLARSATELLITE, 5);
			}}),
			
	HEAVYFIGHTER("Chasseur lourd", 10000, 25, 150,
			new HashMap<Unit, Integer>() {
				private static final long serialVersionUID = 1503492971461264898L;
			{
				put(Ship.SMALLCARGO, 5);
			    put(Ship.ESPIONAGEPROBE, 5);
			    put(Ship.SOLARSATELLITE, 5);
			}}),
			
	CRUISER("Croiseur", 27000, 50, 400,
			new HashMap<Unit, Integer>() {
				private static final long serialVersionUID = 715169448074366155L;
			{
				put(Ship.LIGHTFIGHTER, 6);
			    put(Ship.ESPIONAGEPROBE, 5);
			    put(Ship.SOLARSATELLITE, 5);
			    put(Defense.ROCKETLAUNCHER, 5);
			}}),
			
	BATTLESHIP("Vaisseau de bataille", 60000, 20, 1000,
			new HashMap<Unit, Integer>() {
				private static final long serialVersionUID = -6896712299914490460L;
			{
			    put(Ship.ESPIONAGEPROBE, 5);
			    put(Ship.SOLARSATELLITE, 5);
			}}),
			
	BATTLECRUISER("Traqueur", 70000, 400, 700,
			new HashMap<Unit, Integer>() {
				private static final long serialVersionUID = -7875462897122378281L;
			{
				put(Ship.SMALLCARGO, 3);
				put(Ship.LARGECARGO, 3);
				put(Ship.HEAVYFIGHTER, 4);
				put(Ship.CRUISER, 4);
				put(Ship.BATTLESHIP, 7);
			    put(Ship.ESPIONAGEPROBE, 5);
			    put(Ship.SOLARSATELLITE, 5);
			}}),
			
	BOMBER("Bombardier", 75000, 500, 1000,
			new HashMap<Unit, Integer>() {
				private static final long serialVersionUID = 3886089771877038831L;
			{
				put(Defense.ROCKETLAUNCHER, 20);
				put(Defense.LIGHTLASER, 20);
				put(Defense.HEAVYLASER, 10);
				put(Defense.IONCANNON, 10);
			    put(Ship.ESPIONAGEPROBE, 5);
			    put(Ship.SOLARSATELLITE, 5);
			}}),
			
	DESTROYER("Destructeur", 110000, 500, 2000,
			new HashMap<Unit, Integer>() {
				private static final long serialVersionUID = 13188387676616191L;
			{
				put(Ship.BATTLECRUISER, 2);
				put(Defense.LIGHTLASER, 20);
			    put(Ship.ESPIONAGEPROBE, 5);
			    put(Ship.SOLARSATELLITE, 5);
			}}),
			
	DEATHSTAR("Etoile de la mort", 9000000, 50000, 200000,
			new HashMap<Unit, Integer>() {
				private static final long serialVersionUID = 489186745759320237L;
			{
				put(Ship.SMALLCARGO, 250);
				put(Ship.LARGECARGO, 250);
				put(Ship.LIGHTFIGHTER, 200);
				put(Ship.HEAVYFIGHTER, 100);
				put(Ship.CRUISER, 33);
				put(Ship.BATTLESHIP, 30);
				put(Ship.COLONYSHIP, 250);
				put(Ship.RECYCLER, 250);
				put(Ship.ESPIONAGEPROBE, 1250);
				put(Ship.SOLARSATELLITE, 1250);
				put(Ship.BOMBER, 25);
				put(Ship.DESTROYER, 5);
				put(Defense.ROCKETLAUNCHER, 200);
				put(Defense.LIGHTLASER, 200);
				put(Defense.HEAVYLASER, 100);
				put(Defense.GAUSSCANNON, 50);
				put(Defense.IONCANNON, 100);
				put(Ship.BATTLECRUISER, 200);
			}}),
			
	SMALLCARGO("Petit transporteur", 4000, 10, 5,
			new HashMap<Unit, Integer>() {
				private static final long serialVersionUID = -6661168734300624072L;
			{
			    put(Ship.ESPIONAGEPROBE, 5);
			    put(Ship.SOLARSATELLITE, 5);
			}}),
			
	LARGECARGO("Grand transporteur", 12000, 25, 5,
			new HashMap<Unit, Integer>() {
				private static final long serialVersionUID = -960340371668938288L;
			{
			    put(Ship.ESPIONAGEPROBE, 5);
			    put(Ship.SOLARSATELLITE, 5);
			}}),
			
	COLONYSHIP("Vaisseau de colonisation", 30000, 100, 50,
			new HashMap<Unit, Integer>() {
				private static final long serialVersionUID = 2697056359574486205L;
			{
			    put(Ship.ESPIONAGEPROBE, 5);
			    put(Ship.SOLARSATELLITE, 5);
			}}),
			
	RECYCLER("Recycleur", 16000, 10, 1,
			new HashMap<Unit, Integer>() {
				private static final long serialVersionUID = 2089063497245458688L;
			{
			    put(Ship.ESPIONAGEPROBE, 5);
			    put(Ship.SOLARSATELLITE, 5);
			}}),
			
	ESPIONAGEPROBE("Sonde d'espionnage", 1000, 0, 0,
			new HashMap<Unit, Integer>() {
				private static final long serialVersionUID = 5980264216811193106L;
			{
			}}),
			
	SOLARSATELLITE("Satellite solaire", 2000, 1, 1,
			new HashMap<Unit, Integer>() {
		private static final long serialVersionUID = -3728704253390243020L;
			{
			}});
	
	private final String name;
	private final int structure;
	private final int shield;
	private final int attack;
	private HashMap<Unit, Integer> rapidFire;
	
	/**
	 * @param name	Full name of the Ship
	 */
	Ship(String name, int structure, int shield, int attack, HashMap<Unit, Integer> rapidFire) {
		this.name = name;
		this.structure = structure;
		this.shield = shield;
		this.attack = attack;
		this.rapidFire = rapidFire;
		// TODO : Set the RapidFire
	}
	
	/**
	 * @param rapidFire the rapidFire to set
	 */
	public void setRapidFire(HashMap<Unit, Integer> rapidFire) {
		this.rapidFire = rapidFire;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the structure
	 */
	public int getStructure() {
		return structure;
	}

	/**
	 * @return the shield
	 */
	public int getShield() {
		return shield;
	}

	/**
	 * @return the attack
	 */
	public int getAttack() {
		return attack;
	}

	/**
	 * @return the rapidFire
	 */
	public HashMap<Unit, Integer> getRapidFire() {
		return rapidFire;
	}
	
}
