public class flowScoping3 {

	public static void printOnlyIntegers ( Number number ) {

		if ( ! ( number instanceof Integer data  )) 
			return;
		
		System.out.println ( data.intValue ( ) ) ;

//if the input does not inherit integer then will run return 
//So if the input does inherit integer , then will reach last line and data stays in scope even when if statement ends

	}

	public static void main ( String [] args  ){

		printOnlyIntegers ( 10 );


	}



}