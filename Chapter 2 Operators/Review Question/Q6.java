public class Q6 {

	static long addCandy ( double fruit , float vegetables  ){

		return ( int ) fruit + vegetables;     //DOES NOT COMPILE because you are assigning float to a smaller data type which is long

	}


	public static void main ( String [] args  ) {

		System.out.println ( addCandy( 1.4 , 2.4f ) + " , " );
		System.out.println ( addCandy( 1.9 , (float)4 ) + " , " );
		System.out.println ( addCandy( (long)(int)(short)2 , (float)4 ) + " , " );



	}


}