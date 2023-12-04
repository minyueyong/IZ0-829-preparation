public class Q16 {


	public static void main ( String args [] ){


		char [] wolf = { 'W','e','b','b','y'};


		System.out.print( "A " ) ;

		int q= wolf.length;

		for ( ;; ){

			System.out.print( wolf [ --q ] );
			if ( q==0 ) break;

		}

		System.out.println ("");
		System.out.print( "B " ) ;

		for ( int m=wolf.length - 1 ; m >= 0 ; --m ){

			System.out.print( wolf [ m ] );
		}

		
		System.out.println ("");
		System.out.print( "C " ) ;

		for ( int z =0 ; z < wolf.length ; z++ ){

			//System.out.print( wolf [ wolf.length - z] );

		}

		System.out.println ("");
		System.out.print( "D " ) ;

		int x = wolf.length -1;
		
		for ( int j = 0 ; x >= 0 && j == 0 ; x -- ){          //j here do nothing because its value isn't changing

			System.out.print( wolf [ x] );

		}

		System.out.println ("");
		System.out.print( "E " ) ;

		final int r = wolf.length;
		for ( int w = r -1 ; r > -1 ; w= r-1 ){           //nothing , value of r and w is not changing at all

			System.out.print( wolf [ w] );

		}

		System.out.println ("");
		System.out.print( "F " ) ;


		for ( int i = wolf.length ; i > 0 ; -- i ){

			//System.out.print( wolf [ i] );

		}

		
			


	}




}