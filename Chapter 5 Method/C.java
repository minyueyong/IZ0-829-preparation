

import static zoo.A.hello;
//import static zoo.B.hello;     //if put this will not compile , reference to hello is ambigouous

import static zoo.A.hello2;
//import static zoo.B.hello2;    //if put this will not compile , reference to hello2 is ambigous

public class C {

	public static void main ( String [] args  ) {
		
		System.out.println ( hello );
		
		hello2( ) ;


	}


}