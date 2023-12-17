package Singleton.Database;

import com.sun.tools.javac.Main;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class SingletonDatabase implements IDatabase {
    private Map<String, Integer> capitals;

    private static AtomicInteger instanceCount;

    private static Supplier<SingletonDatabase> instance = () -> {
        instanceCount.incrementAndGet();
        return new SingletonDatabase();
    };

    private SingletonDatabase() {
        System.out.println("Initializing database");

        try {
            Path filePath = Paths.get(Main.class.getResource("capitals.txt").toURI());
            List<String> lines = Files.readAllLines(filePath);

            Map<String, Integer> capitalsMap = lines.stream()
                    .map(String::trim)
                    .collect(Collectors.toMap(
                            line -> line.split("\\s+")[0],
                            line -> Integer.parseInt(line.split("\\s+")[1])
                    ));

            System.out.println(capitalsMap);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public Integer getPopulation(String name) {
        return capitals.get(name);
    }

    public static AtomicInteger getInstanceCount() {
        return instanceCount;
    }

    public static Supplier<SingletonDatabase> getInstance() {
        return instance;
    }
}
