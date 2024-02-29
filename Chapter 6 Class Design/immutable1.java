import java.util.*;

public final class immutable1 {


	private final ArrayList <String> favoriteFoods;
	
	public immutable1 (ArrayList <String> favoriteFoods ) {
		
		if ( favoriteFoods == null || favoriteFoods.size() == 0 )
			throw new RuntimeException ( "favoriteFoods is required ");
		
		this.favoriteFoods= favoriteFoods;
	}

	public int getFavoriteFoodsCount ( ) {

		return favoriteFoods.size( ) ;

	}

	public String getFavoriteFoodsItem ( int index ){
		return favoriteFoods.get(index);
	}
	



	public static void main ( String [] args ){

		var favorites = new ArrayList <String>( ) ;
		favorites.add( "Apples");

		var zebra = new immutable1 ( favorites  ) ;            //you are assigning the reference into immutable1 class
		System.out.println ( zebra.getFavoriteFoodsItem (0 ));          
		favorites.clear();

		favorites.add("Chocolate Chip Cookies" );                   //malicious caller can use this reference to modify 
		System.out.println ( zebra.getFavoriteFoodsItem ( 0));
		

	}
}