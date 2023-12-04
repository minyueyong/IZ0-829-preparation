public class indent {

	public static void main ( String [] args ){


		var block = """
			    a
			     b
			    c""";


		var concat = " a\n"
			    +"  b\n"
			    +" c";

	System.out.println ( "Showing Block" );
	System.out.println ( block );
	System.out.println ( block.length() + " characters");      // 3 characters abc,  2 line break behind a and b, 1 space in front of b
        System.out.println ( "" );
        System.out.println ( "After Run indent (1)");
	System.out.println ( block.indent(1).length() + " characters");  //add 3 more space in front of each line and an indent at end of text block
	System.out.println ( block.indent(1) );

	System.out.println ( "After Run indent (-1)");      //one whitespace is removed which is the one in front of b
	System.out.println ( block.indent( -1 ).length() + " characters" );  //3 characters abc, 2 line break behind a and b, 1 indent at end of text block
	System.out.print( block.indent( -1 ));
	


	System.out.println ("---------------------------------------------------" );
	System.out.println ( "Showing Concat" );
	System.out.println ( concat );
	System.out.println ( concat.length()+ " characters" );      // 3 characters abc,  2 line break behind a and b, 2 space in front of b, 2 space for a and c
	System.out.println ( "" );


	System.out.println ( "After Run Indent (-1 )" ) ;    //remove 1 whitespace which is the one in front of b
	System.out.println ( concat.indent(-1).length() + " characters" );  //3 characters abc, 2 line breaks, 1 line in front of b, 1 line break end of text block
        System.out.println ( concat.indent(-1));
	System.out.println ("");

	System.out.println ( "After Run Indent ( -4 )" );    //remove all whitespace
	System.out.println ( concat.indent(-4).length() + " characters" ); //3 characters abc, 2 line breaks, 1 line break end of text block
	System.out.println ( concat.indent(-4));


	System.out.println ( "------Strip Indent-------" ) ;    //since a and c have 1 whitespace , b have 2 whitespace so remove 1 whitespace from each line
	System.out.println ( concat.stripIndent().length() + " characters" ) ;  //remove 1 whitespace from each line
	System.out.println (  concat.stripIndent() );




	}



}