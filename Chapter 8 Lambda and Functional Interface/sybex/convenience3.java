/*
Function compose( )
 */

package sybex;
import java.util.function.Function;

public class convenience3 {

    public static void main(String[] args) {
        Function < Integer , Integer > before = x -> x +1;
        Function <Integer, Integer > after = x -> x * 2;


        //First function is run and the result is pass to second function
        // 2+1 = 3
        // 3*2 = 6
        Function <Integer , Integer > combined = after.compose( before );
        System.out.println (combined.apply(2));
    }
}
