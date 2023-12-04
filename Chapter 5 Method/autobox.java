public class autobox {


	public static void main ( String [] args ) {

		Integer e = Integer.valueOf ( 9 ) ;
		long ears = e;                        // int -> long  ( 1 step )
		Long ear = e ;			//int -> Long / Integer -> Long   ( 2 step won't compile )


		Long badGorilla = 8;
		// int -> Integer / long ( 2 step won't compile )





	}




}