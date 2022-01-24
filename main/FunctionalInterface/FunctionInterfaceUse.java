import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionInterfaceUse {
    public static Function<Integer, Double> sub = (integer -> integer - 3.55);
    public static BiFunction<Integer,Integer,Boolean> check = (a,b)-> a>b;
    public static void main(String[] args) {
        System.out.println(sub.apply(10));
        sub = sub.andThen(integer->integer*1.11);
        System.out.println(sub.apply(100));
        System.out.println(check.apply(10, 5));


    }
}
