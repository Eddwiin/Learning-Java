package Singleton.Database;

public class SingletonRecordFinder {
    public Integer totalPopulation(String[] names) {
        Integer result = 0;

        for (String name : names) {
            result += SingletonDatabase.getInstance().get().getPopulation(name);
        }

        return result;
    }
}
