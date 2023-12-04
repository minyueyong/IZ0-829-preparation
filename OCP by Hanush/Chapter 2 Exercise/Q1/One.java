package one;
import two.*;

public class One {

	public static int age ;
	public String name;

	
	public One ( ){

		age = 1;
		name="Min Yue";


	}


	public static void main ( String [] args  ){

		Two first = new Two ( );
		System.out.println ( first.hello );
		System.out.println ( first.name );
	
	}



}