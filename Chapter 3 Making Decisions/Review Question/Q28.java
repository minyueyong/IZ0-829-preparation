public class Q28 {


	static void getFish ( Object fish ) {

		if ( ! ( fish instanceof String guppy ))
			System.out.print ( "Eat!" );
	
		else if ( ! ( fish instanceof String guppy )) {
	
			throw new RuntimeException ( ) ;
	
		}
	System.out.print ( "Swim" );

	}

	public static void main ( String [] args ){

		getFish ( "goldie" );
		


	}



}