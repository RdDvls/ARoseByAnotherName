package tiy.rose;

/**
 * Created by RdDvls on 8/29/16.
 */
public class SpanishGreeting extends HelloWorld {
    String name = "mundo";

    public void greet(){
        greetSomeone("mundo");
    }

    public void greetSomeone(String someone){
        name = someone;
        System.out.println("Hola, " + name);
    }
}
