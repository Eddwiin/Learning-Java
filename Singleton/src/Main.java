import Singleton.AmbientContext.Building;
import Singleton.AmbientContext.BuildingContext;
import Singleton.AmbientContext.Point;
import Singleton.AmbientContext.Wall;
import Singleton.Monostate.ChiefExecutiveOfficer;
import Singleton.PerThread.PerThreadSingleton;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    private static void getMonostate() {
        ChiefExecutiveOfficer ceo = new ChiefExecutiveOfficer();
        ceo.setName("Adam SMith");
        ceo.setAge(55);

        ChiefExecutiveOfficer ceo2 = new ChiefExecutiveOfficer();
        System.out.println(ceo2.getName());
        System.out.println(ceo2.getAge());
    }

    private static void perThread() {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        CompletableFuture<Void> t1 = CompletableFuture.runAsync(() -> {
            System.out.println("t1: " + PerThreadSingleton.getInstance().getId());
        }, executor);

        CompletableFuture<Void> t2 = CompletableFuture.runAsync(() -> {
            System.out.println("t2: " + PerThreadSingleton.getInstance().getId());
            System.out.println("t2 again: " + PerThreadSingleton.getInstance().getId());
        }, executor);

        CompletableFuture<Void> allOf = CompletableFuture.allOf(t1, t2);

        try {
            allOf.get(5, TimeUnit.SECONDS);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            executor.shutdown();
        }
    }

    private static void ambientContext() {
        Building house = new Building();

        house.walls.add(new Wall(new Point(0,0), new Point(5000,0)));
        house.walls.add(new Wall(new Point(0,0), new Point(0,4000)));

        try (BuildingContext context = new BuildingContext(3500)) {
            house.getWalls().add(new Wall(new Point(0, 0), new Point(5000, 0)));
            house.getWalls().add(new Wall(new Point(0, 0), new Point(0, 4000)));
        } catch (Exception e) {
            e.printStackTrace();
        }

        house.walls.add(new Wall(new Point(5000,0), new Point(5000, 4000)));

        System.out.println(house);
    }

    public static void main(String[] args) {

        //getMonostate();
        //perThread();
        ambientContext();
    }
}