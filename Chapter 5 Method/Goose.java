package pond.goose;
import pond.shore.Bird;

public class Goose extends Bird {

	public void helpGooseSwim ( ) {

//Goose extend Bird so can use method from Bird

		Goose other = new Goose ( ) ;
		other.floatInWater ( );
		System.out.print ( other.text );


	}


	public void helpOtherGooseSwim ( ) {

//Bird reference here didn't extend from Bird so cannot use

		Bird other = new Goose ( ) ;
		//other.floatInWater ( ) ;                 //DOES NOT COMPILE
		//System.out.print ( other.text );       //DOES NOT COMPILE


	}



}