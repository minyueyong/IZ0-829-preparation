abstract class Nocturnal {

	boolean isBlind ( );   //DOES NOT COMPILE either declare as abstract or give it implementation if its non abstract class

}

class Q15 extends Nocturnal {

	public boolean isBlind ( )  { return false; }
	
	public static void main ( String [] args ){
	
		var nocturnal = ( Nocturnal ) new Q15 ( ) ;
		System.out.println ( nocturnal.isBlind ( ) );
	
	
	}


}