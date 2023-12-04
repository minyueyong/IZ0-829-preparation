public class incredecre {

	public static void main ( String [] args  ){

		int parkAttendance = 0;

		System.out.println ( parkAttendance );      //0
		System.out.println ( "++parkAttendance =" + ++parkAttendance );    //1    increase value and return NEW value
		System.out.println ( parkAttendance );      //1

		//Now that parkAttendance = 1 , we apply post decrement operator
		//will return original value first
		System.out.println ( "parkAttendance-- =" + parkAttendance-- );    //1    decrease value and return ORIGINAL value

		// Only will return NEW value after that
		System.out.println ( parkAttendance );	    //0


		System.out.println ( "parkAttendance++ =" + parkAttendance ++);    //0       increase value and return ORIGINAL value
		//after return original value , here will return new value
		System.out.println ( parkAttendance );                            //1

		System.out.println ("--parkAttendance =" + --parkAttendance );    //0     decrease value and return NEW value
		System.out.println ( parkAttendance );                            //0



	}



}