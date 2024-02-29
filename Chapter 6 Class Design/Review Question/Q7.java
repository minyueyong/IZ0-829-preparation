class Arthropod {
 
        protected void printName ( long input ) {
         
                System.out.println ( "Arthropod");
         
        }
         
        void printName ( int input ) {
         
                System.out.println ( "Spooky");
         
        }
 
}
 
public class Q7 extends Arthropod {
 
        protected void printName ( int input ) {
         
                System.out.println ( "Spider" );
         
        }
         
        public static void main ( String [ ] args) {
         
                Arthropod a = new Q7 ( );
                a.printName ((short)   4 );
                a.printName (  4 );
                a.printName ( 5L );
         
        }
 
}
