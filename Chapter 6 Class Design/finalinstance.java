public class finalinstance {
	
	private final int volume;
	private final String type;

	{ this.volume =10 ; }

	public finalinstance ( String type ){

		this.type = type;

	}

	public finalinstance ( ) {

		//this.volume= 2;          DOES NOT COMPILE because volume is already assign a value at the instance initializer

 //still didn't compile because didn't assign value to type


	}

	public static void main ( String [] args ){


	}



}