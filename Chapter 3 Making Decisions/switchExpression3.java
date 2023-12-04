public class switchExpression3 {

	public static void printSeason ( int month ){

		switch ( month ) {

			case 1, 2, 3 -> System.out.println ("Winter");
			case 4, 5, 6 -> System.out.println ("Spring");
			case 7,8,9 -> System.out.println ( "Summer" );
			case 10, 11, 12 -> System.out.println ("Fall");


		}


	}


	public static void main ( String [] args  ){
		
		printSeason ( 3 );

	}


}