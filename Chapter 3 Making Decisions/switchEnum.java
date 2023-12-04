public class switchEnum {

	enum Season { WINTER, SPRING , SUMMER , FALL }

	static String getWeather ( Season value ){

		return switch ( value ) {

			case WINTER -> "Cold";
			case SPRING -> "Rainy";
			case SUMMER -> "Hot";
			case FALL -> "Warm";

		};

	}

	public static void main ( String [] args  ){

		
		System.out.println (getWeather( Season.WINTER )) ;

		


	}


}