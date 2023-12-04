public class staticNull {

	public static long hiss = 2;

	public static void main ( String [] args ){

		staticNull s = new staticNull ( ) ;
		System.out.println ( s.hiss );
		s = null;
		System.out.println ( s.hiss );


	}



}