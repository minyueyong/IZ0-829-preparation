//Demonstration without using lambda


package sybex;

import java.util.ArrayList;
import java.util.List;

public class TraditionalSearchLambda {
    public static void main(String[] args) {
        var animals = new ArrayList<Animal>();
        animals.add(new Animal ("fish", false , true));
        animals.add(new Animal ("kangaroo", true , false));
        animals.add(new Animal ("rabbit", true , false));
        animals.add(new Animal ("turtle", false , true));

        print ( animals, a->a.canHop()); //print method accept CheckTrait interface type
        //while CheckIfHopper implements CheckTrait
    }

    private static void print (List<Animal> animals, CheckTrait checker ){
        for ( Animal animal : animals ){
            if ( checker.test(animal )){
                System.out.println ( animal  + "");
            }

        }
    }


}
