interface HasTail {
	public int getTailLength ();
}

interface HasWhiskers {
	public int getNumberOfWhiskers () ;

}

abstract class HarborSeal implements HasTail, HasWhiskers {}   //HarborSeal is abstract class so it don't have to override abstract method

public class CommonSeal extends HarborSeal {}    //CommonSeal is non abstract class so have to override all the abstract method