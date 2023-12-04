public class Q11 {

	enum Animal { BIRD , FISH , MAMMAL }
	
	static void printLocation ( Animal a ){
	
		long type = switch ( a ){
		
			case BIRD -> { yield 1; }        //If have case block then must have yield statement, else will be like the others
			
			case FISH -> 2;
			
			case MAMMAL -> 3;
			
			default -> 4;
		
		};
		
		System.out.print ( type ) ;
	
	}

	public static void main ( String [] args  ){

		printLocation ( Animal.MAMMAL );

	}


}