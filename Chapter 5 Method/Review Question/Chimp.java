import rope.*;
import static rope.Rope.*;
 
public class Chimp {
	 
	public static void main ( String [] args ){
		 
		swing ( ) ;    					//only can use if we import static 
		Rope.swing( );     				//only can use if we import the class
		new Rope( ) .swing ( );      			//only can use if we import the class
		System.out.println ( LENGTH );      		//only can use if we import static

		System.out.println ( Rope.LENGTH );    		//only can use if we import the class
	}
}