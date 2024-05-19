/*
Supplier means supply
Supplier take no parameter but will return a value

@FunctionalInterface
public interface Supplier <T>{
    T get ( ) ;
}

 */

package sybex;

import java.time.LocalDate;
import java.util.function.Supplier;

public class Supplier1 {

    public static void main(String[] args) {
        Supplier<LocalDate> s1 = LocalDate::now;

        LocalDate a = s1.get();
        System.out.println ( a);
    }
}
