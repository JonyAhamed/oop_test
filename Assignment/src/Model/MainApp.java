package Model;

public class MainApp {

	public static void main(String[] args) {

		// 3 object of dchero

		DCHero dcHero1 = new DCHero( 2, 3, 5, "dc hero 1", true, 0.75);
	
		dcHero1.print();

		DCHero dcHero2 = new DCHero(4, 5, 6, "dc hero 2", false, 0.75);
		dcHero2.print();

		DCHero dcHero3 = new DCHero(3, 4, 5, "dc hero 3", false, 0.75);
		dcHero3.print();

		System.out.println("-------------------------------------------------------");
		// 2 object of marvelhero
		MarvelHero marvelHero1 = new MarvelHero(1, 2, 3, "marvel hero 1", 0.82);
		marvelHero1.print();

		MarvelHero marvelHero2 = new MarvelHero(4, 5, 6, "marvel hero 2", 0.82);
		marvelHero2.print();

	}

}
