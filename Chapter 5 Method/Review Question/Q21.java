public class Q21 {

	//we need to overload this method

	public void moo ( int m , int ... n ) { }



	// public void moo ( int a , int ... b ) { }   this is the same method as above , only with different name as parameter

	public int moo ( char ch ) { }

	public void moooo ( int ... z ) { }    //different name so not overload

	private void moo ( int ... x ) { }

	public void moooo ( int y ) { }      //different name so not overload

	//public void moo ( int ... c , int d ) { }      varargs must be the last parameter

	// public void moo ( int ... i , int j ... ) { }   wtf is int j ...



	public static void main ( String [] args ) {


	}



}