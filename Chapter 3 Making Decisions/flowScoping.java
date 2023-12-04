public class flowScoping {

	public static void  compareInteger ( Number number ) {


// if the number we pass is not instanceof Integer then data will be out of scope and cannot be use, but the statement after  || will 
// still be executed and we cannot allow it to happen

// As compared when you use && , then if number is not instanceof Integer , means its false and the statement after && right side won't be //executed

		if ( number instanceof Integer data  || data.compareTo(5) > 0 )

			System.out.print ( data );
		

	}

	public static void main ( String [] args ){

		compareInteger ( 10 ) ;


		


	}



}