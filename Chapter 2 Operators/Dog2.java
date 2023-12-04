interface Swimmer {}

class Dog2 implements Swimmer {

	public static void main ( String [] args ){

		Swimmer mySwimmer = new Dog2();

		if (mySwimmer instanceof Swimmer) {
    			System.out.println("mySwimmer implements Swimmer");
		}



		Dog2 dog = new Dog2( );

		if ( dog instanceof Dog2 ){

			System.out.println("dog instanceof Dog2");
		}
	}

}
