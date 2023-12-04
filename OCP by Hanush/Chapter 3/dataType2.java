public class dataType2 {

	public static void main ( String [] args ){

		//DOES not compile even though byte didn't hold a negative value

		byte b = 127;

		char a = b;

		//char cannot hold negative value

		byte c = -128;
		
		char d = c;


	}



}