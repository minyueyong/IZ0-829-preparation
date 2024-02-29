class Speedster {
 
	int numSpots;
	 
}
 
public class Q5 extends Speedster {
 
	int numSpots;
	 
	public Q5 ( int numSpots ){
	 
		
		//numSpots=numSpots;                return 0         
		//numSpots = this.numSpots;          return 0
		//this.numSpots = numSpots;          return 0
		//numSpots= super.numSpots;          return 0
		super.numSpots = numSpots;
	}
	 
	public static void main ( String [ ] args ) {
	 
		Speedster s = new Q5 ( 50 );
		System.out.println ( s.numSpots );   //0
	}
}