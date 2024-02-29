class Carnivore {

	protected boolean hasFur = false;


}

public class hidingvariables extends Carnivore{

	protected boolean hasFur = true;

	public static void main ( String [] args ){

		hidingvariables m = new hidingvariables( ) ;

		Carnivore c = m;

		System.out.println ( m.hasFur ) ;   //true

		System.out.println ( c.hasFur );    //false   follow the reference type at the left


	}


}