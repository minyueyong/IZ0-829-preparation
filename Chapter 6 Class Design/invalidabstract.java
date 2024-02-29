public abstract class invalidabstract {

	public abstract long eat ( )            //DOES NOT COMPILE bcuz don't have semicolon
	public abstract void swim () { } ;     //DOES NOT COMPILE bcuz cannot have curly braces
	public abstract int getAge ( ) {        //DOES NOT COMPILE bcuz abstract cannot have implementation

		return 10;
	}

	public abstract void sleep ;          //DOES NOT COMPILE bcuz don't have brackets

	public void goInShell ( ) ;          //DOES NOT COMPILE bcuz its not abstract class but don't have implementation



}