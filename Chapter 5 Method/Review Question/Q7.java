public class Q7 {


	public static  int juggle ( boolean b , boolean ... b2 ) {
		
		return b2.length ;


	}


	public static void main ( String [] args ){

		//System.out.println ( "juggle ( ) " + juggle ( ) );
		System.out.println ( "juggle ( true ) " + juggle ( true ) );
		System.out.println ( "juggle ( true , true) " + juggle ( true , true ) );
		System.out.println ( "juggle ( true , true , true) " + juggle ( true , true , true) );
		//System.out.println ( "juggle ( true , {true , true}) " + juggle ( true ,{ true , true}) );

		System.out.println ( "juggle ( true , {true , true}) " + juggle ( true ,new boolean [] { true , true}) );
		System.out.println ( "juggle ( true , new boolean [ 2 ] ) " + juggle ( true , new boolean [ 2 ] ) );
		


	}




}