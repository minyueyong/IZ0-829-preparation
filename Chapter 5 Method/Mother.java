package yong.family ;

public class Mother extends Grandma{

	public void helpGooseSwim ( ) {

	//Mother extend Grandma so can use method from Grandma

		Mother other = new Mother ( ) ;
		other.floatInWater ( );
		System.out.print ( other.text );


	}


	
}