class Animal {}
public class Dog extends Animal {

	public static void main ( String [] args ){


		Animal myAnimal = new Dog();

		if (myAnimal instanceof Animal) {
    			System.out.println("myAnimal is an instance of Animal");
		}


		if (myAnimal instanceof Dog) {
    			System.out.println("myAnimal is an instance of Dog");
		}

//-------------------------------------------------------------------------------

		//Dog doggie = new Animal ( );

		Dog doggie = new Dog ( );
	


	}


}

