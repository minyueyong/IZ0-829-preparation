interface Walk {
	public default int getSpeed() { return 5; }
}

interface Run {

	public default int getSpeed () { return 10; }

}

public class callingDefault implements Walk , Run {

	public int getSpeed ( ) {
		return 1;
	}

	public int getWalkSpeed( ) {

		return Walk.super.getSpeed();

	}

	public static void main ( String [] args ){
	
	}


}  