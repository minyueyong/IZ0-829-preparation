public class Q16 {
 
	public void print ( byte x ) {
	 
		System.out.println ( "byte-");
	 
	}
	 
	public void print ( int x  ) {
	 
		System.out.println ("int - " );
		 
	}
	 
	public void print ( float x ) {
	 
		System.out.println ( "float - ");
		 
	}
	 
	public void print ( Object x ){
	 
		System.out.println ("Object  - ");
	}
	 
	public static void main ( String [ ] args ){
	 
		Q16 t = new Q16 ( );
		short s = 123;     //short will auto promote to int
		t.print ( s );
		t.print ( true );
		t.print ( 6.789 );
		 
}}