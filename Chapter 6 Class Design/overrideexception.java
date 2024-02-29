class Reptile {

	protected void sleep ( )  throws IOException { } 
	
	protected void hide( ) { } 

	protected void exitShell throws FileNotFoundException { } 


}

public class overrideexception extends Reptile {

	public void sleep ( )  throws FileNotFoundException { } 

	public void hide( ) throws FileNotFoundException { }           //DOES NOT COMPILE  parent class don't have exception

	public void exitShell( )  throws IOException{ }                //DOES NOT COMPILE IO exception is broader than FileNotFoundException in parent class


}