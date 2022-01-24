import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerInterfaceUse {
    public static  void main(String[] args) {
        Consumer<Integer> print = (input)-> System.out.println("Entered value is "+input);
        print.accept(10);

        Employee employee = new Employee(1 ,24 ,"M" ,"Ali", "Abbas" );
        Employee employee1 = new Employee(2 ,14 ,"M" ,"Ali", "Abbas" );
        Employee employee2 = new Employee(3 ,24 ,"f" ,"Ali", "Abbas" );
        Employee employee3 = new Employee(4 ,14 ,"f" ,"Ali", "Abbas" );

        Consumer<Employee> listConsumer = input-> {
            System.out.print(input.getId()+" ");
            System.out.print(input.getAge()+" ");
            System.out.print(input.getGender()+" ");
            System.out.print(input.getFirstName()+" ");
            System.out.print(input.getLastName()+" ");
            System.out.println();
        } ;
        listConsumer.accept(employee);
        listConsumer.accept(employee1);
        listConsumer.accept(employee2);
        listConsumer.accept(employee3);

        BiConsumer<Integer, Integer> check = (a,b)-> System.out.println(a>b);
        check.accept(3,2);
    }
}
