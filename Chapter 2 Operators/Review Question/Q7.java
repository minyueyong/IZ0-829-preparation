public class Q7 {

	public static void main ( String [] args ) {

		int ph = 7 , vis = 2;

		boolean clear = vis > 1 & ( vis < 9 || ph < 2 );    // true & ( true || false)   = true & true = true

		boolean safe = ( vis > 2 ) && ( ph++ > 1 );         // false because if left side false  then right side won't be evaluated

		boolean tasty = 7 <= --ph;                      // 7<= 6 = false

		System.out.println ( clear + "-" + safe + "-" + tasty);


	}



}