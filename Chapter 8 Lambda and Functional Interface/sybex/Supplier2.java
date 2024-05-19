/*
Supplier means supply
Supplier take no parameter but will return a value

@FunctionalInterface
public interface Supplier <T>{
    T get ( ) ;
}

 */

package sybex;
import java.util.function.Supplier;

public class Supplier2 {
    public static void main(String[] args) {

        Supplier <StringBuilder> s1= StringBuilder::new;
        System.out.println ( s1.get());    //return empty string
    }

}
