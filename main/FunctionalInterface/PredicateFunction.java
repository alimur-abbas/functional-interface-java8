import java.util.function.Predicate;

public class PredicateFunction
{
    public static Predicate<Employee> isAdultMale()
    {
        return p -> p.getAge() > 21 && p.getGender().equalsIgnoreCase("M");
    }
    static void pred(int number, Predicate<Integer> predicate)
    {
        if (predicate.test(number)) {
            System.out.println("Number " + number);
        }
    }

    public static void main(String[] args)
    {
//        Predicate<Integer> predicate = (i)-> i > 18;

        pred(22 , (i) -> i > 18);


        Employee employee = new Employee(1 ,24 ,"M" ,"Ali", "Abbas" );
        Employee employee1 = new Employee(2 ,14 ,"M" ,"Ali", "Abbas" );
        Employee employee2 = new Employee(3 ,24 ,"f" ,"Ali", "Abbas" );
        Employee employee3 = new Employee(4 ,14 ,"f" ,"Ali", "Abbas" );
        System.out.println(isAdultMale().test(employee));
        System.out.println(isAdultMale().test(employee1));
        System.out.println(isAdultMale().test(employee2));
        System.out.println(isAdultMale().test(employee3));

        Predicate<Integer> isAdult = (i)-> i > 18;

        boolean abc =isAdult.test(22);
        System.out.println(abc);




        }


    }


