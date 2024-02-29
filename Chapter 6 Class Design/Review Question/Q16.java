class Arachnid {
 
	static StringBuilder sb = new StringBuilder ( );
	 
	{ sb.append ( "c" ) ; }
	 
	static { sb.append ( "u" ) ;}
	 
	{ sb.append ("r" ) ; }
}
 
public class Q16 extends Arachnid {
	 
	static {  sb.append ("q"); }
	 
	{ sb.append ("m" ); }
	 
	public static void main ( String [] args ){
	 
		System.out.println ( Q16.sb + " " );
		System.out.println ( Q16.sb + " " );
		 
		new Arachnid ( );
		new Q16 ( );
		System.out.println ( Q16.sb );
	}
}