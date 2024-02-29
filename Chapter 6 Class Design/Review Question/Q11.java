public class Q11 {
 
	StringBuilder value = new StringBuilder ( "t " );
	 
	{ value.append ( "a" ) ;}
	 
	{ value.append ( "c" ) ;}
	 
	private Q11  ( ){
	 
		value.append ( "b " );
	}
	 
	public Q11  ( String s ) {
		this ( );
		value.append ( s );
	 
	}
	 
	public Q11  ( CharSequence p ){
		value.append ( p );
	}
	 
	public static void main ( String [] args ) {
	 
		Object bear = new Q11  ( );
		bear = new Q11  ( "f" );
		System.out.println (( ( Q11  ) bear ) . value );
	}
}