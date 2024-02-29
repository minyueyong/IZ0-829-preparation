class Camel {

	public int getHumps ( ) {

		return 1;

	}


}

public class overrideaccess extends Camel {

	private int getHumps ( ) {                 //DOES NOT COMPILE because override method in child
						  //class is more restrictive than in parent class

		return 2;

	}



}
