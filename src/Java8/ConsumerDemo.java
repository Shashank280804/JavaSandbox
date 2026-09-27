package Java8;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {

        Consumer<String> printName =
                name -> System.out.println("Hello " + name);

        printName.accept("Shashank");
    }
}
