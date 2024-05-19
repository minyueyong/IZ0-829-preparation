/* Consumer

You use consumer when you want to do something with a parameter but not return anything

@FunctionalInterface
public interface Consumer <T> {
    void accept ( T t )
 }
 */


package sybex;

import java.util.function.Consumer;

public class Consumer1 {
    public static void main(String[] args) {
        Consumer<String > c1 = System.out::println ;
        c1.accept ( "Annie");
    }

}
