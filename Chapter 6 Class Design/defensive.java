import java.util.*;

public final class defensive {


	private final ArrayList <String> favoriteFoods;
	
	public defensive (ArrayList <String> favoriteFoods ) {
		
		if ( favoriteFoods == null || favoriteFoods.size() == 0 )
			throw new RuntimeException ( "favoriteFoods is required ");
		
		this.favoriteFoods= new ArrayList<String> ( favoriteFoods);                    //we create a new copy of the favoriteFoods pass into it and return that copy
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

		var zebra = new defensive ( favorites  ) ;           
		System.out.println ( zebra.getFavoriteFoodsItem (0 ));         //Apples      
		favorites.clear();

		favorites.add("Chocolate Chip Cookies" );                 
		System.out.println ( zebra.getFavoriteFoodsItem ( 0)); //Apples

		System.out.println ( "Original favorites: " + favorites );
		

	}
}