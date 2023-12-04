import java.time. *;
public class Q22 {

	public static void main ( String [] args ){



		var date = LocalDate.of ( 2022 , Month.APRIL , 30 );
		date.plusDays ( 2 );
		date.plusYears ( 3 );
		System.out.println ( date.getYear( ) + " " + date.getMonth( ) + " " + date.getDayOfMonth ( ) ) ;




	}




}