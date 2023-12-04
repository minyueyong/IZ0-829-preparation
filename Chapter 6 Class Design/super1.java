class Animal { 

	private int age;
	private String name;

	public Animal ( int age , String name ){

		super ( ) ;
		this.age = age;
		this.name = name;

		System.out.println ( "Calling Animal ( int age , String name ) constructor");

	}

	public Animal ( int age ){

		
		super();
		this.age = age;
		this.name = null;
		System.out.println ( "Calling Animal ( int age  ) constructor");


	}
	
}

public class super1 extends Animal{

	public super1 ( int age ){

		super ( age , "Gorilla");   //call Animal first constructor

	}

	public super1 ( ){

		super(5);   //call Animal second constructor


	}

	public static void main ( String [] args ){

		super1 s = new super1( 5 ) ;
		super1 t = new super1();

	}



}