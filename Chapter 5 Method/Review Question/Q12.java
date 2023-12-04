//Add keyword final to variable to see which one is effectively final
//

public class Q12  {


	public void feed ( ) {

		final int monkey = 0;
		if ( monkey > 0 ) {

			final var giraffe = monkey ++ ;         //giraffe is effectively final

			System.out.println ( "Giraffe" + giraffe );
			final String name;	                // name1 is effectively final	
			name = "geoffrey" ;

		}

		final String name = "milly";
		final var food = 10;
		while ( monkey <=  10 ){

			food = 0;


		}

		name = null;



	}


	public static void main ( String [] args ) {


		Q12 persona = new Q12 ( ) ;
		persona.feed ( ) ;



	}




}