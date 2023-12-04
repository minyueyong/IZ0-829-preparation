import java.time. *;

public class periods1 {

	public static void main ( String [] args ) {


		var wrong = Period.ofYears ( 1 );
		wrong = Period.ofWeeks ( 1 );

		System.out.println ( wrong );     //7D only the last one counts


	}



}