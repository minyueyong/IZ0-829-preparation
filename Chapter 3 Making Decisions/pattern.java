public class pattern {

	public static void compareIntegers ( Number number ) {

		if ( number instanceof Integer  ) {

			Integer data = ( Integer ) number;         //we have to convert Number to Integer first 


			System.out.println ( data.compareTo(5) ) ;

		}


	}

	public static void main ( String [] args ){

		compareIntegers ( 1 );


	}



}