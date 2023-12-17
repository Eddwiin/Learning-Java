package Singleton.Database;

public class ConfigurableRecondFinder {
    private IDatabase database;

    public ConfigurableRecondFinder(IDatabase database) {
        this.database = database;
    }

    public int getTotalPopulation(String[] names)
    {
        int result = 0;
        for (String name : names) {
            result += database.getPopulation("name");
        }
        return result;
    }
}
