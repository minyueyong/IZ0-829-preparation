/*
Function andThen ( )
 */

package sybex;

import java.util.function.Function;

public class convenience4 {

    public static void main(String[] args) {
        Function<Integer, Integer> multiplyByTwo = x -> x * 2;

        // Define the second function
        Function<Integer, Integer> addThree = x -> x + 3;

        // Chain the functions together
        Function<Integer, Integer> multiplyThenAdd = multiplyByTwo.andThen(addThree);

        // Apply the chained function
        int result = multiplyThenAdd.apply(5); // (5 * 2) + 3 = 13

        // Print the result
        System.out.println("Result: " + result); // Output: Result: 13

    }
}
