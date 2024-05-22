/*
Convenience and ( )  & negate ( )
Convenience method allows us to combine 2 predicate with conditions
 */

package sybex;

import java.util.function.Predicate;

public class convenience1 {

    public static void main(String[] args) {
        Predicate <String> egg = s -> s.contains ( "egg");
        Predicate <String> brown = s -> s.contains("brown");

        //Combine 2 predicate above
        //Original :
        //Predicate <String> brownEggs = s -> s.contains ( "egg") && s -> s.contains("brown");
        //Predicate<String> otherEggs = s -> s.contains ( "egg") && !s.contains("brown");

        Predicate <String> brownEggs = egg.and(brown);
        Predicate<String> otherEggs = egg.and (brown.negate());
    }
}
