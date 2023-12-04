import java.time. *;

public class DateTimeImmutable {

	public static void main ( String [] args ){


		var date = LocalDate.of ( 2024 , Month.JANUARY , 20 );
		date.plusDays ( 10 );                      //need to assign to a variable because date and time classes is immutable
		System.out.println ( date );


	}



}