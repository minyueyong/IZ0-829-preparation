public class passingObjects {


	public static void main ( String [] args ){

		var name = new StringBuilder ( "Webby" );
		speak ( name );
		System.out.print ( name );


	}

//passing the reference means the caller and the method are changing the same object

	public static void speak ( StringBuilder s ) {

		s.append ( "Georgette" );

	}



}