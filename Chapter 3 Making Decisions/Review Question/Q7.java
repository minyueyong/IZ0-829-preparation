public class Q7 {

	public static void main ( String [] args  ){

		int [] weather =  {1, 2, 3, 4}; 



		//A
		for ( int i = weather.length ; i > 0 ; i -- ){
			//System.out.print ( weather[i]);
			
		}
		System.out.println("B");

		//B
		for ( int i = 0 ; i <= weather.length-1 ; ++ i ){
			System.out.print ( weather[i]);
			
		}
		System.out.println("");
		System.out.print("C");
		System.out.println("");

		//C
		for ( var w : weather ){
			System.out.print ( w);	
		}
		System.out.println("");
		System.out.print("D");
		System.out.println("");

		//D
		for ( int i = weather.length - 1 ; i >= 0 ; i--){
			System.out.print ( weather[i]);
			
		}

		System.out.println("");
		System.out.print("E");
		System.out.println("");

		//E   ( DOES NOT COMPILE because have to remove int at j
		//for( int i =0, int j = 3; i < weather.length ; ++i )   
		//	System.out.println ( weather[i]);

		//F
		for( int i =0 ; ++i < 10 && i < weather.length; ){
			//System.out.print( weather[i]);
			System.out.println();
		}

	}



}