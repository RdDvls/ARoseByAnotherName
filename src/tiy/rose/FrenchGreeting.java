package tiy.rose;

/**
 * Created by RdDvls on 8/29/16.
 */
public class FrenchGreeting extends HelloWorld {
    String name = "tout le monde";
    public void greet(){
        greetSomeone("tout le monde");
    }

    public void greetSomeone(String someone) {
        name = someone;
        System.out.println("Salut " + name);
    }
}
