package sybex;

import java.util.function.Predicate;

public class lambdaBody1 {

    public static void main(String[] args) {

        //We cannot redeclare parameter variables inside lambda body
        // (a , b ) -> { int a = 0 ; return 5;};


    }

    public void variables(int a) {
        int b = 1;

       /* Predicate<Integer> p1 = a -> {           //a is already defined
            int b =0;                     //b is already defined
            int c=0;
            return b == c ;
        };                    //must have semi colon after the lambda
    }*/
    }
}
