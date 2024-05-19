//Demonstration using lamba
// boolean test ( Animal a )
// a -> a.canHop()
//Java know a parameter is animal and canHop() will return boolean
// test method is canHop


package sybex;

import java.util.ArrayList;
import java.util.List;

public class TraditionalSearch {
    public static void main(String[] args) {
        var animals = new ArrayList<Animal>();
        animals.add(new Animal ("fish", false , true));
        animals.add(new Animal ("kangaroo", true , false));
        animals.add(new Animal ("rabbit", true , false));
        animals.add(new Animal ("turtle", false , true));

        print ( animals, a -> a.canHop());
        //CheckTrait have 1 abstract method
        // we pass this lambda as the abstract method

        //var invalid = ( Animal a ) -> a.canHop();    cannot use lambda with var
    }

    private static void print (List<Animal> animals, CheckTrait checker ){
        for ( Animal animal : animals ){
            if ( checker.test(animal )){
                System.out.println ( animal  + "");
            }

        }
    }


}
