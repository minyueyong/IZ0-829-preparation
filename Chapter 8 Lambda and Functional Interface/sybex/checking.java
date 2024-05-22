package sybex;

import java.util.List;
import java.util.function.*;

public class checking {

    public static void main(String[] args) {

        // Take in 1 parameter which is a list of Strings & returns a boolean , must be Predicate
       Predicate <List <String>> ex1 = x -> "".equals(x.get(0));

       //Take in 1 parameter but return nothing , so its Consumer
       Consumer<Long> ex2 =  System.out::println;

       //BiPredicate because takes 2 parameter and return boolean
      BiPredicate<String, String > ex3 = (s1, s2 ) -> false;


      //Function must define with 2 values ( 1 input and 1 return type )
        //Function<List <String> > ex3 = x -> x.get(0);
        Function<List <String> , String> ex4 = x -> x.get(0);   //Correct

        //input and return type must be the same. Cannot take in long but return double
       // UnaryOperator < Long > ex5 = ( Long l ) -> 3.14;

    }
}
