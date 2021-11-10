package Model;

public class MarvelHero extends Hero {

	private String name;
	private double factor;

	public MarvelHero(int strength, int stamina, int charisma, String name, double factor) {
		super(strength, stamina, charisma);
		this.name = name;
		this.factor = factor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getFactor() {
		return factor;
	}

	public void setFactor(double factor) {
		this.factor = factor;
	}

	public double showRating() {

		return calculateRating(factor);
	}

	public void print() {
		String information = "Name:" + name + " factor" + factor +  " ratings:" + showRating();
		System.out.println(information);
	}

}
