public class dataType{

	//for method call , you can only pass a smaller data type into a larger data type or else you have to do casting

	public static void test ( short i ){}
	public static void test2( int j ) { }

	public static void main ( String [] args ){

		short a = 1;

		dataType.test ( ( short )  2 );    

		dataType.test2( a );


	}



}