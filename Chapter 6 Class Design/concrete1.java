abstract class Mammal {

	abstract void showHorn ( ) ;
	abstract void eatLeaf( ) ;
	public void nonabstract( ) {

		System.out.println ("I am not abstract class");

	}


}

 class Rhino extends Mammal {

	void showHorn(){};        //Rhino has become concrete class and must override eatLeaf method
	void eatLeaf( ) {};


}

public class concrete1 extends Rhino {

	//void eatLeaf( ) {}

	public static void main ( String [] args ){


	}


}
