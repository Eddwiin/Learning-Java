package facade;

public class PersonJobBuilder extends Person2Builder {
    public PersonJobBuilder(Person2 person2) {
        this.person2 = person2;
    }

    public PersonJobBuilder at(String companyName)
    {
        person2.setCompanyName(companyName);
        return this;
    }

    public PersonJobBuilder asA(String position)
    {
        person2.setPosition(position);
        return this;
    }

    public PersonJobBuilder earning(int annualIncome)
    {
        person2.setAnnualIncome(annualIncome);
        return this;
    }
}
