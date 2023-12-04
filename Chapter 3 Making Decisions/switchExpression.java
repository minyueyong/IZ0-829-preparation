public class switchExpression {


	public static void printDayOfWeek ( int day  ) {

		//can put switch expression result into a variable

		var result = switch ( day  ) {

			case 0 -> "Sunday";
			case 1 -> "Monday";
			case 2 -> "Tuesday";
			case 3 -> 3;              //I can return int or even String and it will still return it in var result
			case 4 -> "Thursday";
			case 5 -> "Friday";
			case 6 -> "Saturday";

			default -> "Invalid Value";


		};
		System.out.println ( result );   //return wednesday

	}

	public static void main ( String []  args) {

		printDayOfWeek(3);
	}


}