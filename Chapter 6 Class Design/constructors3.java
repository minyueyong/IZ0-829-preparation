//Java compiler will automatically inserts a call to super( ) if you do not call this ( ) or 
//super ( )  as the first line of a constructor

public class constructors3 {

	public constructors3 ( ) {
		//here will add super ( )  but will call to Object class
		System.out.println (" automatically will call super ( ) ");

	}

	public constructors3 (int age ) {
		//here will add super ( )  but will call to Object class
		System.out.println ( " calling constructors");
		

	}


	public static void main ( String [] args ){

		constructors3 c = new constructors3 ( 5 );


	}



}