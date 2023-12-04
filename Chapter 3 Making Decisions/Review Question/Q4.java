public class Q4 {

// DOES not compile because although it returns a type but does not cover all possible input values ( don't have default case )

	static void printReptile ( int category ) {

		var type = switch ( category ) {

			case 1 , 2 -> "Snake";
			case 3 , 4 -> "Lizard";
			case 5 , 6 -> "Turtle";
			case 7 , 8 -> "Alligator";

		};

		System.out.print(type);


	}


	public static void main ( String [] args  ) {

		printReptile ( 6 );


	}


}