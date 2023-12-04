public class flowScoping2 {

	public static void  compareInteger ( Number number ) {


		if ( number instanceof Integer data  )

			System.out.println ( data.intValue() );
			System.out.println ( data.intValue() );     //DOES NOT COMPILE because this line is not inside the if statement
		

	}

	public static void main ( String [] args ){

		compareInteger ( 10 ) ;


	}

}