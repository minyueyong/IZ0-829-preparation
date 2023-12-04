class Data {

	int x = 10;

}

public class referenceFinal {

	public static void main ( String [] args  ) {

		final Data d = new Data ( );

		d= new Data ();          // d is final so you cannot make it point to a new object

		d.x = 20;                   // but you can change the instance variable inside d


	}


}