//All values inside case must be final and cannot be method parameter because method parameter not final

import java.time.*;

public class Q10 {


	private static DayOfWeek getWeekDay ( int day, final int thursday ){

		int otherDay = day;
		int Sunday = 0;

		switch ( otherDay ){

			default:
			case 1:
			 continue;                             //DOES NOT COMPILE bcuz continue should not be inside switch expression
			
			case thursday:                             //DOES NOT COMPILE bcuz constant expression required
				return DayOfWeek.THURSDAY;

			case 2, 10:
				break;
		
			case Sunday:                             //DOES NOT COMPILE bcuz constant expression required

				return DayOfWeek.SUNDAY;

			case DayOfWeek.MONDAY:                     //DOES NOT COMPILE because cannot convert to int

				return DayOfWeek.MONDAY;


		}

		return DayOfWeek.FRIDAY;


	}

	public static void main ( String [] args ){


		


	}



}