public class Q19 {
 
	final String value1 = "red";
	static String value2 = "blue";
	String value3 = "yellow";
	 
	{
	 
		//CODE SNIPPET 1

		//value1= "green" ;           DOES NOT COMPILE because value1 is final variable, cannot be change
		value2 = "purple";
		value3 = "orange";
	 
	}
	 
	static{
	 
		//CODE SNIPPET 2

		//value1= "magenta" ;            DOES NOT COMPILE because value1 is not a static variable
		value2 = "cyan";
		//value3 = "turquoise";          DOES NOT COMPILE because value3 is not a static variable
		 
	}


	public static void main ( String [] args ){

	}
}