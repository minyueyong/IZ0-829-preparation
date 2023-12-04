public class StringDifference {

	public static void main ( String [] args ){

		StringBuilder sb = new StringBuilder ( "start" );
		sb.append( "+middle" );
		StringBuilder same = sb.append( "+end" );

		System.out.println(sb);        //start+middle+end
		System.out.println(same);      //start+middle+end


		String sb2 = "start";
		sb2.concat("+middle");
		//if use sb2 += "+middle" then it will be start+middle+end
		String same2 = sb2 + "+end";

		System.out.println(sb2);         //start
		System.out.println(same2);       //start+end


	}


}