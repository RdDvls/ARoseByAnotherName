package tiy.rose;

/**
 * Created by RdDvls on 8/29/16.
 */
public class EnglishGreeting extends HelloWorld{
    String name = "world";

    public void greet(){
        greetSomeone("world");
    }
    public void greetSomeone(String someone){
        name = "world";
        System.out.println("Hello " + name);
    }
}
