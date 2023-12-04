public class Q2 {

	public static void main ( String [] args ) {

		boolean canine = true, wolf = true;
		int teeth = 20;
		canine = ( teeth != 10 ) ^ ( wolf = false );                 //canine = true ^ false = true
		System.out.println ( canine + "," + teeth + "," + wolf );


	}


}