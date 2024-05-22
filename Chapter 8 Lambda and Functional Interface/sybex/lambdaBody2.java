/*
Lambda can access instance variable -> color
method parameter -> name
local variable -> volume
 */

package sybex;

import java.util.function.Consumer;

public class lambdaBody2 {

    private String color;
    public static void main(String[] args) {

    }

    public void caw ( String name ){
        String volume = "loudly";
        Consumer<String> consumer = s -> System.out.println ( name + volume + color);
    }
}
