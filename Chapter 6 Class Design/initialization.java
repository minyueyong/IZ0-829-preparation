class Animal {

	static { System.out.print ("A"); } 

}


public class initialization extends Animal {

	public static void main ( String [] args ) {

		System.out.print ( "C" ) ;
		new initialization ( ) ;
		new initialization ( ) ;
		new initialization ( ) ;


	}

	static { System.out.print ("B" ); } 


}