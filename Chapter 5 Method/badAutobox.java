public class badAutobox {

	public void rest ( Long x  ) {

		System.out.print ( "long" );


	}

	public static void main ( String [] args ){

		var g = new badAutobox ( ) ;
		g.rest ( 8 );

// int -> Integer / long  ->  both don't fit into Long

	}




}