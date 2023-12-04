public class Q27 {

	public static void main ( String [] args ){

		byte amphibian = 1;
		String name = "frog";

		String color = switch ( amphibian ) {

			case 1 -> { yield "Red" ;}
			case 2 -> {   if ( name.equals ( "Frogs" ) )     //DOES NOT COMPILE
					yield "Green" ;}
		
			case 3 -> {  yield "Purple" ;} 
	
			default -> throw new RuntimeException ();


		};

	System.out.print ( color );



	}



}