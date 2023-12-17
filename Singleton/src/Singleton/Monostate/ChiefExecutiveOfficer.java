package Singleton.Monostate;

public class ChiefExecutiveOfficer {
    private static String name;
    private static int age;

    public void setName(String name) {
        ChiefExecutiveOfficer.name = name;
    }

    public void setAge(int age) {
        ChiefExecutiveOfficer.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}
