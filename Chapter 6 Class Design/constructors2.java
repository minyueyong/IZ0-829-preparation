public class constructors2 {

	private String color ;
	private int weight;

	public constructors2 ( int weight, String color ){

		this.weight = weight;
		this.color = color;


	}

/*	public constructors2 ( int weight ){

		this.weight = weight;	// avoid duplication
		color = "brown";
	}



	public constructors2  ( int weight ) {

		constructors2 ( weight , "brown");      //DOES NOT COMPILE

	}


	public constructors2  ( int weight ) {

		new constructors2 ( weight , "brown");      //Compiles but create an extra object

	}
*/

	public constructors2 ( int weight ){
		System.out.println ( "chew" );   //DOES NOT COMPILE this ( ) must be first statement in the constructor

		this ( weight, "brown" );


	}

	public static void main ( String [] args ){

	}


}