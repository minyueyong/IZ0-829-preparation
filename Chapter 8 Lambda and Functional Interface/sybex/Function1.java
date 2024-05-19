/*

Function turning one parameter to a completely different type

@FunctionalInterface
public interface Function < T , R >{
    R apply ( T t );
}
 */


package sybex;
import java.util.function.Function;

public class Function1 {

    public static void main(String[] args) {

        Function < String , Integer > f1 = String::length;
        System.out.println (f1.apply("hello"));

    }
}
