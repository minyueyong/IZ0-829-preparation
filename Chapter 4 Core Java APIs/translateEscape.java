public class translateEscape {

	public static void main ( String [] args ){

		String input = "Hey, \\n This is not normally a line break.";
		System.out.println(input);

		String output = input.translateEscapes();
		System.out.println(output);
	

        	String str2 = "This is tab \t, Next New Line \n,next backspace \b,next Single Quotes \' next,Double Quotes \" ";
		System.out.println(str2);
		System.out.println("After translate Escape");
        	System.out.println(str2.translateEscapes());
   

	}


}