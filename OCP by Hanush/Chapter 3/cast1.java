public class cast1 {

	public static void main ( String [] args  ){

		int i = 10;
		byte b = i;

		// byte c = 128;             DOES NOT COMPILE because byte range is from -128 to 127
		

		i = 128;
		b= (byte )i;

		System.out.println ( b );   //display as -128 because 128 is out of range for byte
		

	}


}