import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class UnaryAndBinaryOperatorUse {
   public  static UnaryOperator<Integer> add = (input)-> input+input;
   public static BinaryOperator<Integer > binaryOperator = (a ,b)-> a+b;
   public static void main(String[] args) {
      System.out.println(add.apply(10));
      System.out.println(binaryOperator.apply(10,20));
   }
}
