/*
@FunctionalInterface
public interface UnaryOperator<T> extends Function < T , T > {
    T apply ( T t );
}

All parameters must be of the same type

 */


package sybex;

import java.util.function.UnaryOperator;

public class UnaryOperator1 {

    public static void main(String[] args) {

        UnaryOperator<String> u1 = String::toUpperCase;

        System.out.println ( u1.apply("chirp"));
    }

}
