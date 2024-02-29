abstract class Canine {

	public abstract String getSound( ) ;     //All class that extends Canine must override this abstract method

	public void bark( ) { System.out.println ( getSound( ) ) ;}


}

class Wolf extends Canine {

	public String getSound ( ) {

		return "Wooof!";

	}

}

class Fox extends Canine {

	public String getSound ( ) {

		return "Squeak!";

	}


}


public class abstract1 extends Canine {


	public String getSound ( ) {

		return "Roar!";

	}

	public static void main ( String [] args ){

		Canine w = new Fox( );
		w.bark();


		Fox m = new Fox ( ) ;  //fox implement Canine so can use bark but get sound is its own
		m.bark( ) ;

	}

}