import person.Address;
import person.Employee;

import java.util.ArrayList;

public class Main {

    private static void copyConstructor() {
        Employee john = new Employee("John", new Address("123 London Road", "London", "UK"));

        Employee chris = new Employee(john);
        chris.setName("Chris");
        System.out.println(john); // oops, john is called chris
        System.out.println(chris);
    }

    private static void deepCopy() {
        personHeritance.Employee john = new personHeritance.Employee();
        john.setNames(new String[]{"John", "Doe"});
        john.setAddress(new personHeritance.Address("London Road", 123));
        john.setSalary(321000);

        personHeritance.Employee copy = john.deepCopy();
       copy.getNames()[0] = "Smith";
       copy.getAddress().setHouseNumber(copy.getAddress().getHouseNumber() + 1);
       copy.setSalary(123000);
    }

    public static void main(String[] args) {
    }

}