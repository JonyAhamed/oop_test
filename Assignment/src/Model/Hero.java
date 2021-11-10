package Model;

public class Hero {
	private int strength;
	private int stamina;
	private int charisma;

	public Hero(int strength, int stamina, int charisma) {
		this.strength = strength;
		this.stamina = stamina;
		this.charisma = charisma;

	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getStamina() {
		return stamina;
	}

	public void setStamina(int stamina) {
		this.stamina = stamina;
	}

	public int getCharisma() {
		return charisma;
	}

	public void setCharisma(int charisma) {
		this.charisma = charisma;
	}

	public double calculateRating(double factor) {

		return ((strength + stamina + charisma) / 3) * factor;
	}
}
