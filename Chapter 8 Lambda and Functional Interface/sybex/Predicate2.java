/*

BiPredicate is often used for filtering and matching

takes 2 parameter and return premitive boolean

@FunctionInterface

public interface Predicate <T> {
    boolean test ( T t, U u )
}
 */

package sybex;

import java.util.function.BiPredicate;


public class Predicate2 {
    public static void main(String[] args) {
        BiPredicate<String, String> b1 = String :: startsWith;
        System.out.println ( b1.test ("chicken", "chick"));
        //java know that first parameter is an object , second parameter is parameter for startsWith

    }

}
