public class caseBlock2{

	public static void main ( String [] args  ) {

		int fish = 5;
		int length = 12;

		switch ( fish ) {

			case 1 -> "Goldfish";
			case 2 -> {  "Trout"; }                //if case block the semi colon must be inside { }
			case 3 -> {

				if ( length > 10 ) yield "Blobfish";
				else yield "Green";
			}
			case 4 -> {  "hello" ;}       DOES NOT COMPILE because case block must have yield statement if switch expression 
							//  returns a value

			case 5-> { }             //DOES NOT COMPILE because need yield if switch expression returns a value

			case 6 -> {

				if (  length > 10 ) yield "Blobfish";          //DOES NOT COMPILE because it didn't yield
			}
			
			default -> "SwordFish";

		};

		System.out.println ( name );


	}


}