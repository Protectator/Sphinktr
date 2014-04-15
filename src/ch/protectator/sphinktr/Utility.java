package ch.protectator.sphinktr;

public abstract class Utility {
	
	private static int hpBarScale = 200;
	
	public static String hpBar(int hp, int max) {
		int numberOfFull = hp / hpBarScale;
		int numberOfEmpty = max / hpBarScale - numberOfFull;
		return new String(new char[numberOfFull]).replace("\0", "█") + new String(new char[numberOfEmpty]).replace("\0", "░");
	}

}
