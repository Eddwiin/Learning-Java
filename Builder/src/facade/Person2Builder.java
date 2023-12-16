package facade;

public class Person2Builder {
    protected Person2 person2 = new Person2();

    public PersonAddressBuilder getPersonAddressBuilder() {
        return new PersonAddressBuilder(person2);
    }

    public PersonJobBuilder getPersonJobBuilder() {
        return new PersonJobBuilder(person2);
    }

    public Person2 build() {
        return this.person2;
    }
}
