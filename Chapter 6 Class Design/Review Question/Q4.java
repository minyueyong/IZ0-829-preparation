class Mammal {
 
	private void sneeze ( ) { };
	 
	public Mammal ( int age ) {
	 
		System.out.println ("Mammal" );
	}
}
 
public class Q4 extends Mammal {
 
	int sneeze ( ) {  return 1 ;}
	 
	public Q4 ( ){
	 
		System.out.println ("Platypus" );      //DOES NOT COMPILE
	}
	 
	public static void main ( String [] args ) {
		new Mammal ( 5 );
	} 
}