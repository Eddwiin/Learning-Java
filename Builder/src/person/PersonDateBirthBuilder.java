package person;

public class PersonDateBirthBuilder<SELF> extends PersonEmailBuilder<PersonDateBirthBuilder<SELF>>{

    public SELF setDateOfBirth(String dateOfBirth) {
        person.setDateOfBirth(dateOfBirth);
        return (SELF) this;
    }
}
