 abstract interface WalkOnTwoLegs { }      //interface are not required to define any methods

public class Biped {

	public static void main ( String [] args ){

		var e = new WalkOnTwoLegs ( ) ;    //DOES NOT compile because cannot instantiate interface

	}


}