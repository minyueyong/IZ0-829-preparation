public class Q9 {

	public static void main ( String [] args  ) {

		int a = 2, b= 4 , c= 2;

		System.out.println( a > 2 ? --c : b++ );                   // false so will return 4 because b = 4
		System.out.println ( b = ( a != c ? a : b++ ) ) ;          // false so here b is 5 because of post increment operator at line above , b = 5
		System.out.println ( a > b ? b < c ? b : 2 : 1 );         // false so will be 1


	}



}