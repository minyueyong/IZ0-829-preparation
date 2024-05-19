/* Calling instance method on a parameter

 boolean check ( String text , String prefix);

   We call the startsWith method on the instance "Zoo" and parameter "A"
 */

package sybex;

public class twoParameterReference {

    public static void main(String[] args) {
        StringTwoParameterChecker methodRef = String :: startsWith;;

        System.out.println(methodRef.check("Zoo","A"));
    }


}
