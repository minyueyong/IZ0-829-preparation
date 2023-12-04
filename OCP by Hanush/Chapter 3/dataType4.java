public class dataType4 {

	public static void main ( String [] args ){

		
		char c = 127;

		byte b  =  ( byte) c;      //DOES NOT COMPILE when converting from char to byte unless you do casting
 

		
		System.out.println ( b );

	}



}