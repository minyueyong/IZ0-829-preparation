public class Q9 {

	public static void main ( String [] args ){


		String [ ] bugs = { "cricket" , "beetle" , "ladybug" };
		String [ ] alias = bugs;
		String [ ] bugs2 = { "cricket" , "beetle" , "ladybug" };


		//These 2 arrays should be same value and same reference
		System.out.println(  bugs.equals ( alias ) )  ;               //true            
		System.out.println(  bugs == alias )   ;                      //true


		//Compare 2 arrays with same values
		System.out.println(  bugs.equals ( bugs2 ) ) ;                //false         
		System.out.println(  bugs == bugs2 )  ;			     //false


	}



}