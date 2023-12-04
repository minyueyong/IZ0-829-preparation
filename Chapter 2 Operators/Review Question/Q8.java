public class Q8 {

	public static void main ( String [] args ){

		int pig = ( short ) 4;                           
		pig = pig++;                   //post increment operator here will return 4 so now pig is 4      

		// if we put above line as pig++ with no assignment then will be 5          
     
		long goat = ( int ) 2;
		goat -= 1.0;
		System.out.println ( pig + "-" + goat );
		


	}


}