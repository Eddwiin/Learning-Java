package person;

public class PersonEmailBuilder<SELF> extends PersonInfoBuilder<PersonEmailBuilder<SELF>>{
    public SELF setEmail(String email) {
        person.setEmail(email);
        return (SELF) this;
    }
}
