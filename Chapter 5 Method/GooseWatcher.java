package pond.duck;

import pond.goose.Goose;

//Goose Watcher didn't extend Goose so cannot use
//it still cannot access floatInWater even if you make GooseWatcher extends Goose
public class GooseWatcher extends Goose{

	public void watch ( ) {

		Goose goose = new Goose ( );
		goose.floatInWater ( ) ;     //DOES NOT COMPILE


	}


}