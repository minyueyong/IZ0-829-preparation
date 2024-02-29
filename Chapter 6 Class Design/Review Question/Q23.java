class Canine {
 
        public Canine (  boolean t ) {  logger.append( "a") ;   }
        public Canine( ) { logger.append ("q" ) ;}
         
        private StringBuilder logger = new StringBuilder ( );
    protected void print ( String v ) { logger.append(v) ; }
        protected String view ( ) { return logger.toString( ) ;}
}
 
class Fox extends Canine {
 
        public Fox ( long x ) {  print ( "p" ) ; }
         
        public Fox ( String name ) {
                 
                this ( 2 );
                print ( "z" );
        }
 
}
 
public class Q23 extends Fox {
 
        public Q23 ( int e ){
         
                super ( "tails" );
                print ( "j" );
         
        }
         
        public Q23 ( short f ) {
         
                super( "eevee" );
                print( "m" );
        }
         
        public static void main ( String [] name ){
         
                System.out.println (  new Q23(1) .view ( ) );
         
        }
 
}
