/* BiConsumer

Accept 2 parameters

You use consumer when you want to do something with a parameter but not return anything

Biconsumer here take in map elements and put inside the map

@FunctionalInterface
public interface Consumer <T> {
    void accept ( T t , U u)
 }
 */

package sybex;

import java.util.HashMap;
import java.util.function.BiConsumer;

public class Consumer2 {

    public static void main(String[] args) {
        var map = new HashMap<String, Integer>();

        BiConsumer<String, Integer > b1 = map::put;
        b1.accept("chicken", 1);

        System.out.println( map );
    }
}
