package personHeritance;

public class Employee extends Person implements IDeepCopyable<Employee>{
    private int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public void copyTo(Employee target) {
        super.copyTo(target);
        target.setSalary(salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                '}';
    }
}
