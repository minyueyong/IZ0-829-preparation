import java.util.*;

public final class immutable {


	private final ArrayList <String> favoriteFoods;
	
	public immutable ( ) {
		this.favoriteFoods = new ArrayList <String> ( ) ;
		this.favoriteFoods.add ( "Apples" );
	}
	
	public List < String > getFavoriteFoods ( ) {
	
		return favoriteFoods ;
	}


	public static void main ( String [] args ){

		var zebra = new immutable ( ) ;
		System.out.println ( zebra.getFavoriteFoods ( ));           //here willl return a reference to favoriteFoods string away 										which malicious caller will use
		zebra.getFavoriteFoods ( ).clear();

		zebra.getFavoriteFoods ( ).add("Chocolate Chip Cookies" );
		System.out.println ( zebra.getFavoriteFoods ( ));
		

	}
}