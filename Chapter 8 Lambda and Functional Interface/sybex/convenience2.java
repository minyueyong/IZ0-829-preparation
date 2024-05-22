/*
Consumer andThen ( )
 */

package sybex;

import java.util.function.Consumer;

public class convenience2 {

    public static void main(String[] args) {
        Consumer<String> c1 = x -> System.out.print ("1:" + x);
        Consumer <String> c2 = x -> System.out.print ( ",2:" + x);

        //Consumer andThen combined 2 consumer together and pass one parameter to both
        Consumer <String> combined = c1.andThen(c2);
        combined.accept("Annie");
    }
}
