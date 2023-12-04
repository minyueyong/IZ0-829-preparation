package pond.inland;

import pond.shore.Bird;


// cannot use floatInWater and text from Bird class because they are protected access
//BirdWatcherFromAfar is from a different package than bird and didn't inherit Bird class

public class BirdWatcherFromAfar {

	public void watchBird ( ) {

		Bird bird = new Bird ( ) ;
		bird.floatInWater ( ) ;            //DOES NOT COMPILE

		System.out.print ( bird.text );		//DOES NOT COMPILE


	}



}