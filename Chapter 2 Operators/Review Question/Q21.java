public class Q21 {

	public static void main ( String [] args  ){

		int myFavouriteNumber = 8;
		int bird = ~myFavouriteNumber;                 // multiply by -1 and subtract 1 so bird = -9

		int plane = -myFavouriteNumber;                  // plane = -8

		var superman = bird == plane ? 5 : 10;                           //plane == bird is false so superman = 10
		System.out.println ( bird + "," + plane + "," + --superman );


	}



}