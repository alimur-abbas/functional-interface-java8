public class CustomFunctionalInterface {
    @FunctionalInterface
    public interface custom {
        public int add(int a , int b);
    }

    public static void main(String[] args) {
        custom custom = (input1 , input2)-> input1 + input2;
        System.out.println(custom.add(15 , 20));

    }
}
