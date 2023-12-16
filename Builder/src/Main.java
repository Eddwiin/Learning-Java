
import facade.Person2;
import facade.Person2Builder;
import person.Person;
import person.PersonBuilder;

public class Main {
    public static void buildPerson() {
        Person person = Person.create().setUsername("eddwiin").setPassword("aze").setEmail("mike@test.fr").setDateOfBirth("tere").build();
        System.out.println(person.toString());
    }

    static void buildFacadePerson() {
        Person2Builder pb = new Person2Builder();
        Person2 person = pb
                .getPersonAddressBuilder()
                .at("123 London Road")
                .in("London")
                .withPostcode("SW12BC")
                .getPersonJobBuilder()
                .at("Fabrikam")
                .asA("Engineer")
                .earning(123000)
                        .build();

        System.out.println(person.toString());
    }


    public static void main(String[] args) {

        //buildPerson();
        buildFacadePerson();
    }

}