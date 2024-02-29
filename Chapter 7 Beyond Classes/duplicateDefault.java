 interface Walk {
	public default int getSpeed() { return 5; }
}

interface Run {

	public default int getSpeed () { return 10; }

}

public class duplicateDefault implements Walk , Run {}    //DOES NOT COMPILE , must override if have 2 default method with same signature