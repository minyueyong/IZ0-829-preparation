class Mammal {

	public Mammal ( int age ) { }      //Since Mammal defines a constructor , the compiler does not insert a no argument constructor
	
}


class Seal extends Mammal { }                   //DOES NOT COMPILE


public class superclass extends Mammal {

	public superclass ( ) { }            //DOES NOT COMPILE
}



//superclass ( )  didn't call this ( ) or super ( ) as first line is the constructor so compiler will automatically add super ( )  in it

// public superclass ( )  {  super ( ) }


// Seal class didn't declare a constructor so compiler will add a no argument constructor with super ( ) in it

// public class Seal extends Mammal  {   public Seal ( ) { super( )  }  }


//Both Seal and superclass will call Mammal but Mammal don't have a no argument constructor so does not compile