public class autoboxOverload {

	public void fly ( int numMiles ) {

		System.out.println ( " overload int " );

	}
	public void fly ( Integer numMiles ) { 

		System.out.println ( " overload Integer " );
	}

	public static void main ( String [] args ){

		autoboxOverload f = new autoboxOverload ( ) ;
		f.fly ( 3 );     //will use most specific parameter which is int 

	//if don't have int , then use fly ( Integer )


	}



}