//import static java.util.Arrays;                   DOES NOT COMPILE , only can use static import for static variables and methods
import static java.util.Arrays.asList;
//static import java.util.Arrays.* ;                 DOES NOT COMPILE, should be import static
 
public class BadStaticImport {

	public static void main ( String [ ] args ) {

//		Arrays.asList ( "one") ;                  DOES NOT COMPILE
//cannot use Arrays because Arrays is not imported


	 asList ( "one" );

	}
}