/*Method Reference

LearnToSpeak interface only have 1 abstract method that take in one string
So when you assign Lambda System.out::println, java know to pass the

*/

package sybex;

public class Duckling {

    public static void main ( String [] args ){
        LearnToSpeak learner = System.out::println;
        teacher ("hello",learner);
    }

    public static void teacher ( String name , LearnToSpeak trainer){
        trainer.speak(name);
    }
}
