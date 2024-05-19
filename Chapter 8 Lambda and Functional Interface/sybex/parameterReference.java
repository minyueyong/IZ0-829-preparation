/* Calling instance method on a parameter

   boolean check ( String text );

   We call the isEmpty method on the parameter "Zoo"
 */

package sybex;

public class parameterReference {

    public static void main(String[] args) {
        StringParameterChecker methodRef = String :: isEmpty;;

        System.out.println(methodRef.check("Zoo"));
    }


}
