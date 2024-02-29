abstract class Canine {

	public abstract String getSound( ) ;     //All class that extends Canine must override this abstract method

	public void bark( ) { System.out.println ( getSound( ) ) ;}


}

class FennecFox extends Canine {

	public int getSound ( ) {        //DOES NOT COMPILE return type must be covariant when override

		return 10;
	}
}

class ArticFox extends Canine { }       //DOES NOT COMPILE , must override the abstract method

class Direwolf extends Canine {

	public abstract rest ();
	public String getSound( ) {

		return "Roof!";

	}
}

public class Jackal extends Canine {

	public abstract String name;
	public String getSound( ) {

		return "Laugh";

	}


}
