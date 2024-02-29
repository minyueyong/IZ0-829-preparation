abstract class Mammal {

	abstract CharSequence chew ( ) ;
	
	public Mammal ( ) {
		System.out.println ( chew ( ) );
	}
}

public class abstractconstructor extends Mammal {

	String chew ( ) { return "yummy" ; }         //compiler insert no argument consructor to abstractconstructor and call Mammal constructor

	public static void main ( String [] args ){

		new abstractconstructor() ;

	}


}