public class Q19{

	public static void main ( String [] args ) {

		int start = 7;
		int end = 4;
		end += ++ start ;
		start = ( byte ) ( Byte.MAX_VALUE + 1 );      //Range of byte is -128 to 127


		System.out.println ( "start :" + start );
		System.out.println ( "end : " + end );
		System.out.println ( "Byte.MAX_VALUE :" + Byte.MAX_VALUE );


	}


}