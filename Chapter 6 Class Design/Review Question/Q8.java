abstract class Bird {

	private final void fly ( ) {  System.out.println ( "Bird" );}
	protected Bird( ) { System.out.print ( "Wow-" ) ;}

}

public class Q8 extends Bird {

	public Q8 ( ) { 
	
		System.out.println ( "Oh-");
	} 
	
	protected void fly ( )  {
		
		System.out.println ( "Pelican " ) ;
	
	}
	
	public static void main ( String [] args ){
	
		var chirp = new Q8 ( );
		chirp.fly ( ) ;
	
	
	}


}