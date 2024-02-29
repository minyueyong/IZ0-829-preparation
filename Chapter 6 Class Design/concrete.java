abstract class Mammal {

	abstract void showHorn ( ) ;
	abstract void eatLeaf( ) ;
	public void nonabstract( ) {

		System.out.println ("I am not abstract class");

	}


}

abstract class Rhino extends Mammal {

	void showHorn(){};   


}

public class concrete extends Rhino {

	void eatLeaf( ) {}

	public static void main ( String [] args ){


	}


}

//concrete extend Rhino extend Mammal
///all abstract method must be implemented