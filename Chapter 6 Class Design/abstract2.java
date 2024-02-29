abstract class Canine {

	public abstract String getSound( ) ;     //All class that extends Canine must override this abstract method

	public void bark( ) { System.out.println ( getSound( ) ) ;}


}

class FennecFox extends Canine {

	public int getSound( ) {            //return type not covariant to String 

		return 10;

	}

}

class ArticFox extends Canine {}        //didn't override the abstract method getSound()           

class Direwolf extends Canine {

	//public  abstract rest ( ) ;     only abstract class can declare abstract method

	public String  getSound( ) {

		return "Roof";

	}


}

public class abstract2 extends Canine {


	public abstract String name ;          //variable cannot be marked abstract
	public String getSound( ) {

		return "Laugh";
	}
}