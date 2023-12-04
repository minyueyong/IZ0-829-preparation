public class Q16 {

	public static void main ( String [] args ){


		var base = "ewe\nsheep\\t" ; 
		int length = base.length ( );
		int indent = base.indent ( 2 ).length( ) ;
		int translate = base.translateEscapes( ) .length ( );

		var formatted = "%s %s %s".formatted ( length , indent, translate );
		System.out.format  ( formatted );
		System.out.println ("");

		System.out.println ( base );
		System.out.println ("");
		System.out.println (  base.indent ( 2 ) );
		System.out.println ("");
		System.out.println (  base.translateEscapes( ) );


	}



}