public class initialization1 {

	private String name = "BestZoo";
	
	{ System.out.print ( name + "-"); }

	private static int COUNT = 0;

	static { System.out.print ( COUNT + "-"); };

	static { COUNT += 10 ; System.out.print ( COUNT + "-" );  }
 

	public initialization1 ( ) {

		System.out.print ( "z-" );

	}

	

	public static void main ( String [] args ){

		System.out.println ("before constructor " );

		new initialization1 ( ) ;

		System.out.println ("After constructor " );


	}

}