public class Q17 {

    public Q17() {
        // Compiler inserts an implicit call to super() here
        System.out.println("MyClass no-argument constructor");
    }

    public Q17(int value) {
        this(); // Calling the no-argument constructor of the same class
        System.out.println("MyClass parameterized constructor with value: " + value);
    }


    public static void main ( String [] args ){

		new Q17 ( 52 );

   }
}


//The this() constructor call is used to invoke another constructor within the same class, 
//not to call the default constructor added by the compiler.
