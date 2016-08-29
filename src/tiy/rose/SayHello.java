package tiy.rose;

/**
 * Created by RdDvls on 8/29/16.
 */
public class SayHello {
    public static void main(String[] args) {
        HelloWorld englishGreeting = new EnglishGreeting();
        englishGreeting.greet();
        HelloWorld frenchGreeting = new FrenchGreeting();
        frenchGreeting.greetSomeone("Fred");
        HelloWorld spanishGreeting = new SpanishGreeting();
        spanishGreeting.greet();
    }
}
