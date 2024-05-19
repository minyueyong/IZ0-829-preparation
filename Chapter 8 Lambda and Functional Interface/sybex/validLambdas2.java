//if have 2 parameter , then must have parentheses on the left

package sybex;

public class validLambdas2 {

    public static void main(String[] args) {

        //Valid Lambdas
      System.out.println (  start ("testFun","testy", (x,y) -> x.startsWith("test")));
      System.out.println (  start ("testFun","testy", (String x , String y ) -> x.startsWith("test")));

      //Invalid Lambdas
       // System.out.println (  start ("testFun", x , y-> x.startsWith("test")));  //Missing parentheses on the left


    }

    public static boolean  start(String x, String y ,  validLambda2 p){
        return p.checkStart(x, y);

    }
}
