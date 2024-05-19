/*
    Calling constructor method reference by passing a parameter

    String copy ( String value);
 */

package sybex;

public class constructorReference2 {
    public static void main(String[] args) {
        StringCopier methodRef = String::new;
        var myString = methodRef.copy("whatsup");

        System.out.println (myString.equals("Snake"));
    }

}
