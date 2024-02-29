class Primate {


	public Primate ( ) {

		System.out.print ( "Primate-" ) ;
	}
}

class Ape extends Primate {

	public Ape ( int fur ){

		System.out.print ("Ape1-");
	}

	public Ape ( ) {

		System.out.print ( "Ape2-" );

	}

}

public class initialization2 extends Ape {

	public initialization2 ( ) {

		super ( 2 );
		System.out.print( "initialization2" );


	}

	public static void main ( String [] args ){

		System.out.print( "Statement before-" );

		new initialization2 ( ) ;                     //Answer is Primate-Ape2-initialization2

		System.out.print( "-Statement after-" );


	}
}