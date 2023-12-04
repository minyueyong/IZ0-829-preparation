public class Q8 {

	public static void main ( String [] args ){

		var string = "12345";
		var builder = new StringBuilder ( "12345" );


		System.out.println ( builder.charAt ( 4 ) );
		System.out.println ( builder.replace ( 2 , 4 , "6" ).charAt ( 3 ));
		System.out.println ( builder.replace ( 2 , 5 , "6" ).charAt ( 2 ));
		//System.out.println ( string.charAt ( 5 ));
		//System.out.println (string.length());
		System.out.println ( string.replace ( "123" , "1" ).charAt ( 2 ));
	}



}