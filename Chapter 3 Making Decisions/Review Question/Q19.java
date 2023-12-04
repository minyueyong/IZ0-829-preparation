public class Q19 {


	public static void main ( String [] args ){

		double iguana = 0 ;

		do{

			int snake = 1;

			System.out.print ( snake ++ + " " );

			iguana --;

		}while ( snake <= 5 );                          //variable snake is already out of scope here

		System.out.println ( iguana );


	}



}