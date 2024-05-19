/* STATIC METHOD REFERENCE

Java know the abstract method is   long round ( double num);
so it knows to take in one double parameter and return long

Math.round is a static method
 */

package sybex;

public class staticReference {

    public static void main(String[] args) {
        Converter methodRef = Math :: round;

        System.out.println(methodRef.round(100.0));
    }


}
