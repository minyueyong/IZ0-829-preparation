//if have parameter type , then must have parentheses on the left
//if have curly braces, then must have return statement and semi colon


package sybex;

public class validLambdas {

    public static void main(String[] args) {

        //Valid Lambdas
      System.out.println (  start ("testFun", x -> x.startsWith("test")));
      System.out.println (  start ("testFun", (String x ) -> x.startsWith("test")));

      //Invalid Lambdas
       // System.out.println (  start ("testFun", x -> {x.startsWith("test");}));  //Missing return statement
        //System.out.println (  start ("testFun", String x -> x.startsWith("test")));  //missing parentheses on left
        //System.out.println (  start ("testFun",  x -> { return x.startsWith("test")}));  //missing semi colon

    }

    public static boolean  start(String x, validLambda p){
        return p.checkStart(x);

    }
}
