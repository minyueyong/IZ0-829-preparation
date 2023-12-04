public class initialization1 {

	private String name = "BestZoo";
	
	{ System.out.println ( name + "-"); }

	private static int COUNT = 0;

	static { System.out.print ( COUNT + "-"); };

	static { COUNT += 10 ; System.out.print ( COUNT + "-" );  }

	static { COUNT +=  10 ; System.out.print ( COUNT + "-" ); }
 

	public initialization1 ( ) {

		System.out.print ( "z-" );

	}

	

	public static void main ( String [] args ){

		new initialization1 ( ) ;


	}

}