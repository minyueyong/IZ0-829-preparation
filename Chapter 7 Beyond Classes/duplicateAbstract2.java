interface Herbivore { public void eatPlants ( ) ; }

interface Omnivore { public int eatPlants ( ) ; }

public class duplicateAbstract2 implements Herbivore, Omnivore {

	public void eatPlants ( ) {
		System.out.println ( "Eating Plants" );              //cannot inherit both abstract method because not covariant return type
	}      
}