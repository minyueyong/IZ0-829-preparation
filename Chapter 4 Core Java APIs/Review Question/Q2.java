import java.time. *;

public class Q2 {

	public static void main ( String args [ ] ){

		var zone = ZoneId.of ( "US/Eastern" ) ;

		//var date =  LocalDate.of ( 2022 , 3 , 13 );

		//var date =  LocalDate.of ( 2022 , 3 , 40 );               There is no day 40


		//var date =  LocalDate.of ( 2022 , 11 , 6 );
		//var date =  LocalDate.of ( 2022 , 11 , 7 );
		//var date =  LocalDate.of ( 2023 , 2 , 29 );                   2023 don't have 29th February
		//var date =  LocalDate.of ( 2022 ,  MonthEnum.MARCH , 13 ) ;   don't have MonthEnum, its Month.MARCH

		var time = LocalTime.of ( 2 , 15 );

		var z = ZonedDateTime.of ( date , time, zone );

	}




}