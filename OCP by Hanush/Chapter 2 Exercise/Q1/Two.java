package two;
import one.*;
public class Two {

	public static int hello;
	public String name;

	public Two ( ){

		hello = 2;
		name = "Bitchy Min Li";


	}

	

	public static void main ( String [] args  ){

		One first = new One ( );
		System.out.println ( first.age );
		System.out.println ( first.name );
	
	}

}