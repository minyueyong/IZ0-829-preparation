/*

    Lambda Body can access instance and static variable
    Lambda Body can access local variable and method parameter if they are effectively final

    Effectively final means its value is not change after it is assigned

    when name is pass as method parameter means its already being assigned a value, we cannot reassign again
    
 */

package sybex;

import java.util.function.Consumer;

public class lambdaBody3 {

    private String color;

    public void caw ( String name ){
        String volume = "loudly";
        name = "Caty";
        color = "black";
/*
        Consumer<String> consumer = s ->
                System.out.println ( name , volume, color );   //name and volume is not effectively final*/
        volume = "softly";
    }
}
