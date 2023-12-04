class Insect {

	protected int numberOfLegs = 4;
	String label = "buggy";
}

public class superthis extends Insect {

	protected int numberOfLegs = 6 ;
	short age = 3;
	
	public void printData ( ) {

		System.out.println ( this.label );     //buggy bcuz child class inherit label from super class
		System.out.println ( super.label ) ;    //buggy
		System.out.println ( this.age );         //3
		// System.out.println ( super.age );   DOES NOT COMPILE because parent class don't have age
		System.out.println ( numberOfLegs );      //6  use child class value if use super then use parent class

	}


	public static void main ( String [] args ){

		new superthis( ).printData( );


	}

}