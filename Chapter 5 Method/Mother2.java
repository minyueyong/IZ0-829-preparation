package yong.secondgen ;

import yong.firstgen.Grandma2;

public class Mother2 extends Grandma2{

	public void helpGooseSwim ( ) {

	//Mother extend Grandma so can use method from Grandma

		Mother2 other = new Mother2 ( ) ;
		other.floatInWater ( );
		System.out.print ( other.text );


	}


	
}