interface isColdBlooded {

	boolean hasScales ( ) ;
	 default double getTemperature ( ) {
		return 10.0;
	}
}

public class defaultInterface implements isColdBlooded {

	public boolean hasScales ( ) {

		return true;
	}

	public static void main ( String [] args ){

	}
}