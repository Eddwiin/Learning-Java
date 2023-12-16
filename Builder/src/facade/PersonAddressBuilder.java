package facade;

public class PersonAddressBuilder extends Person2Builder {
    public PersonAddressBuilder(Person2 person2) {
        this.person2 = person2;
    }

    public PersonAddressBuilder at(String streetAddress)
    {
        person2.setStreetAddress(streetAddress);
        return this;
    }

    public PersonAddressBuilder withPostcode(String postcode)
    {
        person2.setPostcode(postcode);
        return this;
    }

    public PersonAddressBuilder in(String city)
    {
        person2.setCity(city);
        return this;
    }
}
