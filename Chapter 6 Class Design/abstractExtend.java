abstract class Canine {

	public abstract String getSound( ) ;     //All class that extends Canine must override this abstract method

	public void bark( ) { System.out.println ( getSound( ) ) ;}


}

public abstract class abstractExtend extends Canine{

	public static void main ( String [] args ){

	}
}