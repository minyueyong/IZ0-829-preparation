abstract interface CanBurrow {

	public abstract Float getSpeed ( int age );       //interface have implicit modifiers
	public static final int MINIMUM_DEPTH = 2;
}

interface Climb {
	Number getSpeed ( int age );
}

public class FieldMouse implements Climb, CanBurrow {     //when you implement interface you must override their abstract methods 

	public Float getSpeed ( int age ) {    //Float is a subtype of number

		return 11f;

	}


}