import java.util.*;

public class Q5 {

	public static void main ( String [] args  ){


		List <Integer> myFavouriteNumbers = new ArrayList <> ( ) ;

		myFavouriteNumbers.add(10);

		myFavouriteNumbers.add ( 14 );

		for ( var a : myFavouriteNumbers ) {

			System.out.print( a + ",");
			break;

		}


		for ( int b : myFavouriteNumbers ) {
 
			continue;                             //after continue is consider unreachable code
			System.out.println (  b + ",");


		}


		for ( Object c : myFavouriteNumbers )
			System.out.print ( c + "," ) ;


	}



}