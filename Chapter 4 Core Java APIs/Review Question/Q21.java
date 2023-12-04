public class Q21 {

	public static void main ( String [] args ) {


	var puzzle = new StringBuilder ( "Java" );
	var puzzle1 = new StringBuilder ( "Java" );
	var puzzle2 = new StringBuilder ( "Java" );
	var puzzle3 = new StringBuilder ( "Java" );

	puzzle.reverse();
	System.out.println ( puzzle );

	puzzle1.append ( "vaJ$" ).substring ( 0 , 4 );
	System.out.println ( puzzle1 );

	puzzle2.append ( "vaJ$" ).delete( 0 , 3 ).deleteCharAt ( puzzle.length( ) - 1 );
	System.out.println ( puzzle2 );

	puzzle3.append ( "vaJ$" ).delete ( 0 , 3 ).deleteCharAt ( puzzle.length( )  );
	System.out.println ( puzzle3 );



	}



}