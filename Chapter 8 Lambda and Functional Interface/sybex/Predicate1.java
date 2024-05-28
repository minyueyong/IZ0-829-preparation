/*

Predicate is often used for filtering and matching

takes 1 parameter and return primiive boolean

@FunctionInterface

public interface Predicate <T> {
    boolean test ( T t )
}
 */

package sybex;

import java.util.function.Predicate;

public class Predicate1 {
    public static void main(String[] args) {
        Predicate<String> p1 = String :: isEmpty;
        System.out.println ( p1.test (""));
    }

}
