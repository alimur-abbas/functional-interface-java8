package Serial;

import java.io.*;

public class SerializableImp {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SerialDemo serialDemo = new SerialDemo();
        serialDemo.i=4;
//        serialDemo.display();
        //serializing
        FileOutputStream fileOutputStream = new FileOutputStream("Object.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(serialDemo);
        objectOutputStream.close();
        fileOutputStream.close();
        // deserializing
        FileInputStream fileInputStream = new FileInputStream("Object.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        SerialDemo serialDemo1= (SerialDemo) objectInputStream.readObject();
        objectInputStream.close();
        fileInputStream.close();
        System.out.println(serialDemo1.i);
            serialDemo1.display();

            Employee employee = new Employee();
            employee.setEmployeeId(1);
            employee.setEmployeeName("Ali");
            employee.setDepartment("CS");
            Address address = new Address(104,"Mahavir para","Bhpt");
            employee.setAddress(address);
            // ====================
            FileOutputStream fileOutputStream1 = new FileOutputStream("Employee.txt");
            ObjectOutputStream objectOutputStream1 = new ObjectOutputStream(fileOutputStream1);
            objectOutputStream1.writeObject(employee);
            objectOutputStream1.close();
            fileOutputStream1.close();
            // =========================
        FileInputStream fileInputStream1 = new FileInputStream("Employee.txt");
        ObjectInputStream objectInputStream1 = new ObjectInputStream(fileInputStream1);
        Employee employee1 = (Employee) objectInputStream1.readObject();
        objectInputStream1.close();
        fileInputStream1.close();
        System.out.println("ID :"+employee1.getEmployeeId());
        System.out.println("NAME :"+employee1.getEmployeeName());
        System.out.println("DEPARTMENT :"+employee1.getDepartment());
//        System.out.println(employee1.getAddress());
        address = employee1.getAddress();
        System.out.println("HOME NO :"+address.getHomeNo());
        System.out.println("STREET :"+address.getStreet());
        System.out.println("CITY :"+address.getCity());
    }
}
class SerialDemo implements Serializable{
    int i ;
    void display(){
        System.out.println(" Md Alimur Rehman Abbas");
    }
}
