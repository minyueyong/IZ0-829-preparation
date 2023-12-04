public class Q15{

	public static void main ( String [] args  ) {

		final char a = 'A', e = 'E';
		char grade = 'B';

		switch ( grade ) {

			default:

			case a :

			case 'B', 'C':                        //DOES NOT COMPILE

				System.out.print ( "great" );

			case 'D':

				System.out.print ( "good " ); 
				break;                          //does not make a difference if you put or don't put

			case e:

			case 'F':

				System.out.print( "not good " );


		}


	}



}