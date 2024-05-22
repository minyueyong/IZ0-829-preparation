/*
@FunctionalInterface
public interface BinaryOperator<T> extends Function < T , T > {
    T apply ( T t1 , T t2);
}

All parameters must be of the same type

 */


package sybex;

import java.util.function.BinaryOperator;


public class BinaryOperator1 {

    public static void main(String[] args) {

        BinaryOperator<String> u1 = String::concat;

        System.out.println ( u1.apply("chirp", "bird"));
    }

}
