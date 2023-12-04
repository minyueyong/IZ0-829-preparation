import rope2.*;
import static rope2.Rope.*;

public class RopeSwing {

	private static Rope rope1 = new Rope ( ) ;
	private static Rope rope2 = new Rope ( ) ;

	{
		System.out.println ( rope1.length );
	}

	public static void main ( String [] args ){

		RopeSwing swing = new RopeSwing ( ) ;   // instance initializer above only will run only when you create a RopeSwing object

		rope1.length = 2;
		rope2.length = 8;
		System.out.println ( rope1.length );

//Answer is just 8
		

	}



}