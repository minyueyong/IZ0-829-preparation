public class varargsOverload {

	public static void fly ( int []  lengths ) { }
	public static void fly ( int ... lengths ) { } 


	public static void main ( String [] args ){


		int [] arr = new int [5];
		fly(  arr );   


	}




}