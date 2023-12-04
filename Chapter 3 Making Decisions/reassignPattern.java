public class reassignPattern {

	public static void compareIntegers ( Number number ) {


		//Check if number is instance of Integer and then convert the value in number into Integer and put inside data

		if ( number instanceof Integer  data ) {
			data = 10;                                             //it is bad practice to reassign a pattern variable

			System.out.println ( data.compareTo(5) ) ;

		}


	}

	public static void main ( String [] args ){

		compareIntegers ( 1 );


	}



}