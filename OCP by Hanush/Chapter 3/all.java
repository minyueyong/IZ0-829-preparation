public class all {

	public static void main ( String [] args ) {

		char c1 = '\u0061';
		short s1 = '\u0061';

		short s2 = c1;              //DOES NOT COMPILE

		char c2 = '\uFEF0';
		 s2= '\uFEF0';                   //DOES NOT COMPILE because value is beyond the range of short
		short s3 = ( short ) '\uFEF0';


		char c3 = 1;

		char c4 = -1;               //DOES NOT COMPILE because -1 cannot fit into char. Char don't take negative value

		short s4 = -1;
		
		char c5 = ( char ) s4;

		


	}



}