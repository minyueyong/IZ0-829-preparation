public class initialization3 {

	private String name = "swimmy";
	
	{ System.out.println ( name );}

	private static int COUNT = 0;

	static  { System.out.println ( COUNT ); } 

	{ COUNT++; System.out.println ( COUNT ); }

	public initialization3 ( ) {
		
		System.out.println ("Constructor");

	}

	public static void main ( String [] args ){

		System.out.println ("Ready");
		new initialization3( ) ;

	}



}