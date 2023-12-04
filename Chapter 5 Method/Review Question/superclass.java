class Mammal {

	public Mammal ( int age ) { } 
}


class Seal extends Mammal { }     //DOES NOT COMPILE


public class superclass extends Mammal {

	public superclass ( ) { }       //DOES NOT COMPILE

}

//Since we already defined a parameterized constructor in Mammal so compiler won't add a no argumetn constructor

//Seal class didn't declare a constructors , so compiler will automatically add a 
//no argument constructor that add super ( )  to call Mammal constructor

//

