/*

BiFunction takes in 2  parameter return a completely different type

@FunctionalInterface
public interface Function < T , R >{
    R apply ( T t , U u);
}
 */

package sybex;
import java.util.function.BiFunction;

public class Function2 {

    public static void main(String[] args) {

        BiFunction <String , String, String > b1 = String::concat;
        System.out.println(b1.apply("baby", "chick"));
        //first parameter is the object, second parameter is the parameter to the concat

    }
}
