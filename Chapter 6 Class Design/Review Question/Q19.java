class Reptile {
 
	{ System.out.println ( "A" ); }
	 
	public Reptile ( int hatch ) { }
	 
	void layEggs ( ) {
	 
		System.out.print( "Reptile" );
	}
}
 
public class Q19 extends Reptile {
 
	static { System.out.print ( "B" ); }
	 
	public Q19  ( int hatch ) { }         //DOES NOT COMPILE
	 
	public final void layEggs  ( ){
	 
		System.out.println ( "Lizard" );
		 
	}
	 
	public static void main ( String [] args ){
	 
		Reptile reptile = new Q19  ( 1 );
		reptile.layEggs( );
	 
	}
 
 
}