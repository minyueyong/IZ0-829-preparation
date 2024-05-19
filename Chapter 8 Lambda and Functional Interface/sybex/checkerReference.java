/* Calling instance method on a particular object

We call the startsWith method on the str object

 boolean check();
 */

package sybex;

public class checkerReference {

    public static void main(String[] args) {
        var str = "";
        StringChecker methodRef = str::isEmpty;

        //StringChecker methodRef2 = str::startsWith;
        // cannot compile because startsWith must take in one parameter while check() takes no parameter

        System.out.println(methodRef.check());

    }


}
