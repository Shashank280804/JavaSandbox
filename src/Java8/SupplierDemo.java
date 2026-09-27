package Java8;
import java.util.function.Supplier;


public class SupplierDemo {
    public static void main(String[] args) {

        Supplier<String> getName =
                () -> "Shashank";

        System.out.println(getName.get());
    }
}
