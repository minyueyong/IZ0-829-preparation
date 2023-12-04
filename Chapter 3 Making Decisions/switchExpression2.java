public class switchExpression2 {

	public static String printSeason ( int month ) {

		return switch ( month ) {

			case 1, 2, 3 -> "Winter";
			case 4, 5, 6 -> "Spring";
			case 7,8,9 -> "Summer";
			case 10, 11, 12 -> "Fall";
			default  -> "No values";          //add this if not cannot compile because the switch expression return something

		};

	}

	public static void main ( String [] args  ) { 
		
		System.out.println  ( printSeason ( 2 ) );

	}



}