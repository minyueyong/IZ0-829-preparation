public class instanceOf {

	public static void main ( String [] args ){


		// Integer inherit both Number and Object

//--------------------------------------------------------------------------------

		Number time = Integer.valueOf(9);

		if ( time instanceof Integer ){

			System.out.println ( " Number is instanceOf Integer ");

		}else {

			System.out.println ( "time not instanceOf Integer" );
		}

//--------------------------------------------------------------------------------

		//Check if Integer is instanceOf Number

		Integer time2 = Integer.valueOf(9);
	
		if ( time2 instanceof Number ){

			System.out.println ( " Integer is instanceOf Number ");

		}else {

			System.out.println ( "Integer not instanceOf Number" );
		}
		


	}


}