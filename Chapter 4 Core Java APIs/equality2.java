public class equality2 {

	public static void main ( String [] args ){

		var singleString = "hello world" ;
		var concat = "hello " ;
		concat += "world";                           //this will create a new string and assign to concat
		System.out.println ( singleString == concat ); //false


	}

}