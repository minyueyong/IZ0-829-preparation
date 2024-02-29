interface Herbivore { public void eatPlants ( ) ; }

interface Omnivore { public void eatPlants ( ) ; }

public class duplicateAbstract implements Herbivore, Omnivore {

	public void eatPlants ( ) {
		System.out.println ( "Eating Plants" );              //inherit both same abstract method
	}      
}