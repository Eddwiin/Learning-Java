package person;

public class PersonBuilder {
    protected Person person = new Person();

    public Person build() {
        return person;
    }
}
