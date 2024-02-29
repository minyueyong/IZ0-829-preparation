public interface conflictingModifiers {

	private int count = 4;            //DOES NOT COMPILE
	protected void step ();           //DOES NOT COMPILE


}