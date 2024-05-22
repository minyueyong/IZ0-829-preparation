/*
@FunctionalInterface
public interface BooleanSupplier{
    boolean getAsBoolean( );
}

 */

package sybex;
import java.util.function.BooleanSupplier;

public class BooleanSupplier1 {

    public static void main(String[] args) {

        BooleanSupplier b1 = () -> true;
        BooleanSupplier b2 = () -> Math.random() > 0.5;

        System.out.println (b1.getAsBoolean());
        System.out.println (b2.getAsBoolean());

    }
}
