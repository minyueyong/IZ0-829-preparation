public class Q23{

	public static void main ( String [] args ){

		int penguin = 50 , turtle = 75;
		
		boolean older = penguin >= turtle;

		if ( older = true )
			System.out.println ( "Success" );
		else
			System.out.println ( "Failure" );            //this else is matched with the if above

		else if ( penguin != 50 )                            //DOES NOT COMPILE

			System.out.println ( "Other" );


	}



}