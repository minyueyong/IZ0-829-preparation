public class Q12 {

	public static void main ( String [] args ){


		var numbers =  "012345678".indent ( 1 );
		numbers = numbers.stripLeading ( ) ;
		System.out.println ( "substring ( 1 , 3 ) = " + numbers.substring ( 1 , 3 ));
		System.out.println ("substring ( 7 , 7) = " + numbers.substring ( 7 , 7 ));
		System.out.println ("substring ( 7 ) = " + numbers.substring ( 7 ));


	}



}