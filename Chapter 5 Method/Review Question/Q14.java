public class Q14 { 

	private static final String leftRope;
	private static final String rightRope;
	private static final String bench;                 //DOES NOT COMPILE because it is not initialize in declaration and static block
	private static final String name = "name";
	 
	static {
		leftRope = "left";
		rightRope = "right";            // DOES NOT COMPILE bcuz it is already initialized
	}
	 
	static {
		name ="name";                     //DOES NOT COMPILE bcuz it is already initialized
		rightRope = "right";
		
	}
	 
	public static void main ( String [ ] args ){
		bench = "bench";              //DOES NOT COMPILE bcuz static final can only initialize in declaration and static block
	}



}