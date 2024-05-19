/*
Supplier means supply
Supplier take no parameter but will return a value

@FunctionalInterface
public interface Supplier <T>{
    T get ( ) ;
}

 */

package sybex;
import java.util.ArrayList;
import java.util.function.Supplier;

public class Supplier3 {
    public static void main(String[] args) {

        Supplier <ArrayList<String>> s1= ArrayList::new;
        ArrayList<String> a1 = s1.get();
        System.out.println ( a1);    //return empty string
    }

}
