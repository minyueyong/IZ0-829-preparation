public class StringBuilder1 {

	public static void main ( String [] args ){

		StringBuilder a = new StringBuilder( "abc" );
		StringBuilder b = a.append( "de" );    //a and b now pointing to same reference

		b = b.append( "f" ).append( "g" );          // what you add in b will reflect back to a

		System.out.println ( "a= " + a );   //abcdefg
		System.out.println ("b=" + b );     //abcdefg


	}



}