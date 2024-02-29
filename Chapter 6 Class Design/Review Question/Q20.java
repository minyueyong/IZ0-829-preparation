class Bird {
 
        int feathers = 0;
        Bird ( int x ) { this.feathers = x ;  }
         
        Bird fly ( ) {
                return new Bird ( 1 );
        }
}
 
class Parrot extends Bird {
 
        protected Parrot ( int y ) { super ( y ) ; }
         
        protected Parrot fly ( ) {
         
                return new Parrot ( 2 );
         
        }
 
}
 
public class Q20 extends Parrot {
 
        public Q20 ( int z ) { super ( z ) ;}
         
        public Q20 fly ( ){
         
                return new Q20 ( 3 );
         
        }
         
        public static void main ( String ... sing ){
         
                Bird p = new Q20 ( 4 );
                System.out.println (( (Parrot) p.fly ( )) . feathers );
         
         
        }
 
}
