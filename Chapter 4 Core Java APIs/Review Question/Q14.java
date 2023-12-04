import java.time. *;

public class Q14 {

	public static void main ( String [] args ){

		var date = LocalDate.now ( ) ;
		var time = LocalTime.now ( ) ;
		var dateTime = LocalDateTime.now( ) ;
		var zoneId = ZoneId.systemDefault( ) ;
		var zonedDateTime = ZonedDateTime.of ( dateTime , zoneId ) ;

		Instant instant1 = Instant.now();

		//Instant instant = new Instant();
		//Instant instant = date.toInstant();
		//Instant instant = dateTime.toInstant();
		//Instant instant = time.toInstant();
		Instant instant2 = zonedDateTime.toInstant();


	}



}