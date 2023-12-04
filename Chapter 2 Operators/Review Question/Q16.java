public class Q16 { 

	public static void main ( String [] args ){

		int note = 1 * 2 + ( long ) 3;                     //DOES NOT COMPILE because inserting long into smaller data type int 
		short melody = ( byte ) ( double ) ( note *= 2 );
		double song = melody;
		float symphoby = ( float ) (( song == 1_000f  ) ? song * 2L : song );


	}



}