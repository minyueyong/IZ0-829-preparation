public class switchDataType {

	

	public static void main ( String [] args  ) {

		int measurement = 10;

		int size = switch ( measurement ){      //can compile if you put as var size

			case 5 -> 1;
			case 10 -> (short )2;           // short can be cast to int so its ok
			default -> 5;
			case 20 -> "3";                 //DOES NOT COMPILE
			case 40 -> 4L;			//DOES NOT COMPILE
			case 50 -> null;		//DOES NOT COMPILE

		};


	}


}