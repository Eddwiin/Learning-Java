package personHeritance;


import java.util.Arrays;

public class Person {
    private String[] names;
    private Address address;

    public Person() {
    }

    public Person(String[] names, Address address) {
        this.names = names;
        this.address = address;
    }

    public String[] getNames() {
        return names;
    }

    public Address getAddress() {
        return address;
    }


    public void setNames(String[] names) {
        this.names = names;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "names=" + Arrays.toString(names) +
                ", address=" + address +
                '}';
    }

    public void copyTo(Person target) {
        target.setNames(names.clone());
        target.setAddress(address.deepCopy());
    }
}
