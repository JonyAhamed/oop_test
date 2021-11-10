package Model;
public class DCHero<String> extends Hero {

	private String name;
	private boolean canFly;
	private double factor;

	public DCHero(int strength, int stamina, int charisma, String name, boolean canFly, double factor) {
		super(strength, stamina, charisma);
		this.name = name;
		this.canFly = canFly;
		this.factor = factor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isCanFly() {
		return canFly;
	}

	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
	}

	public double getFactor() {
		return factor;
	}

	public void setFactor(double factor) {
		this.factor = factor;
	}

	public double showRatings() {

		return calculateRating(factor);
	}

	public void print() {
		java.lang.String info= "Name:" + name + " can fly:" + canFly + " factor:" + factor + " Ratings:" + showRatings();
		System.out.println(info);
	}

}
