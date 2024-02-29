interface HasTail {
	public int getTailLength ();
}

interface HasWhiskers {
	public int getNumberOfWhiskers () ;

}

public abstract class HarborSeal2 implements HasTail, HasWhiskers {

	public static void main ( String [] args ) {}
}   //HarborSeal is abstract class so it don't have to override abstract method

