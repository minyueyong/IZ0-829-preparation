/*
    Calling constructor method reference
 */

package sybex;

public class constructorReference {
    public static void main(String[] args) {
        EmptyStringCreator methodRef = String::new;
        var myString = methodRef.create();

        System.out.println (myString.equals("Snake"));
    }

}
