package pond.swan;
import pond.shore.Bird;

public class Swan extends Bird {

	public void swim ( ) {

		floatInWater ( ) ;
		System.out.print ( text );

	}

	public void helpOtherSwanSwim ( ) {

		Swan other = new Swan ( ) ;
		other.floatInWater ( ) ;
		System.out.print ( other.text );


	}

	public void helpOtherBirdSwim ( ) {

//Bird here doesn't inherit from Bird so cannot access from Bird class
		Bird otherBird = new Bird ( ) ;         
		otherBird.floatInWater ( ) ;                 //DOES NOT COMPILE
		System.out.print( otherBird.text ) ;         //DOES NOT COMPILE


	}

		public void helpOtherGooseSwim ( ) {
	
	//Bird reference here didn't extend from Bird so cannot use
	
		Bird otherSwan = new Swan( ) ;
		otherSwan.floatInWater ( ) ;                 //DOES NOT COMPILE
		System.out.print ( otherSwan.text );       //DOES NOT COMPILE
	
	
}



}