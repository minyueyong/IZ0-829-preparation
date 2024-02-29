class Rhino {

	protected CharSequencce getName ( ) {

		return "rhino" ; 

	}

	protected String getColor ( ) {


		return "gery, black, or white ";

	}



}

public class overridecovariant extends Rhino {

	public String getName ( ) {              //can compile because String is a subtype of CharSequence
		
		return "javan rhino";

	}


	public CharSequence getColor () {          //DOES NOT COMPILE

		return "grey";
	}



}