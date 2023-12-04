public class Q21{

	static void findZookeeper ( Long id ){         //DOES NOT COMPILE because boolean, long , float , double is not allow in switch

	System.out.print ( switch ( id ) {
	
		case 10 ->  { "Jane" }              //DOES NOT COMPILE because case block will need yield and have semi colon inside
		case 20 ->  { yield "Lisa" ;  } ;   //DOES NOT COMPILE because semi colon must be inside case block only
		case 30 -> "Kelly" ;
		case 30 -> "Sally";                  //DOES NOT COMPILE because 2 same case values
		default -> "Unassigned";
	
	
	
	});

}

public static void main ( String [] args ){

	findZookeeper ( 30 ) ;


}


}