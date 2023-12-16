package person;

public class PersonInfoBuilder<SELF> extends PersonBuilder {
    public SELF setUsername(String username) {
        person.setUsername(username);
        return (SELF) this;
    }

    public SELF setPassword(String password) {
        person.setPassword(password);
        return (SELF) this;
    }
}
