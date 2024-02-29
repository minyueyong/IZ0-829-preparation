class Bird {

	public final boolean hasFeathers( ) {

		return true;
	}

	public final static void flyAway ( ) {

	}

}

public class overridefinal extends Bird {

	public final boolean hasFeathers( ){    //DOES NOT COMPILE parent class method is final
		
		return false;
	}

	public final static void flyAway( ) {   //DOES NOT COMPILE


	}


}