class Mammal {
 
	private void eat ( ) { }
	protected static void drink ( ) { }
	public Integer dance ( String p ) { return null; }
}
 
class Primate extends Mammal {
	public void eat ( String p )     {}      //Line 7
}
 
public class Q18 extends Primate {
 
	public static void drink ( ) throws RuntimeException { }      //Line 10
	public Number dance ( CharSequence p ) { return null ; }       //Line 11
	//public int eat ( String p ) { }       cannot override because int and void are not covariant                           
	 
}