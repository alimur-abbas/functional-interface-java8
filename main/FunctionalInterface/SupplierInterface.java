import java.util.function.Supplier;

public class SupplierInterface {
    public static Supplier<String> display = () -> "Ali";

    public static void main(String[] args) {
        System.out.println(display.get());
    }
}
