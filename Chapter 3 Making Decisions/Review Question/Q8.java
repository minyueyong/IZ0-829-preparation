public class Q8 {

	static void printType ( Object o ){

		if ( o instanceof Integer bat ) {

			System.out.print( "int" ) ;

			

		} else if ( o instanceof Integer bat && bat < 10 ){

			System.out.print( "small int" ) ;

		}else if ( o instanceof Long bat || bat <= 20 ){         //DOES NOT COMPILE because if o instanceof Long bat is false then right side of the expression will still run but then bat variable is undefined

			System.out.print( "long" ) ;


		}default {                                    //DOES NOT COMPILE

			System.out.print( "unknown" ) ;

		}


	}

	public static void main ( String [] args  ) {


	}



}