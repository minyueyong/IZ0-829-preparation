class Bear {

	public static void sneeze ( ) {

		System.out.println ( "Bear is sneezing");

	}

	public void hibernate ( ) {

		System.out.println ( "Bear is hibernating");


	}

	public static void laugh ( ) {

		System.out.println ( "Bear is laughing");

	}



}

public class hidingstatic1 extends Bear {

	public void sneeze( ) {                             //DOES NOT COMPILE parent class have static but child class no static

		System.out.println ( "Sun Bear sneezes quietly");

	}

	public static void hibernate( ) {           //DOES NOT COMPILE parent class no static but child class have static

		System.out.println ( "Sun Bear is going to sleep");


	}


}