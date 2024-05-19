/* Calling instance method on a particular object

We call the startsWith method on the str object
 */

package sybex;

public class objectReference {

    public static void main(String[] args) {
        var str = "Zoo";
        StringStart methodRef = str::startsWith;

        System.out.println(methodRef.beginningCheck("s"));
    }


}
