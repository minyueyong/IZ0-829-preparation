public class subtype{

	public static void main ( String [] args  ){

		Integer value = 123;
		
		if ( value instanceof Integer ) { }

//below DOES NOT COMPILE because pattern matching requires pattern variable to be a subtype of Integer
//  <main type>  instanceof < subtype >

	//	if ( value instanceof Integer data ) { }            


// What if its a bigger type??

//		if ( value instanceof Number data ){}   //DOES NOT COMPILE because Number is not a subtype of Integer , its the opposite


	}


}