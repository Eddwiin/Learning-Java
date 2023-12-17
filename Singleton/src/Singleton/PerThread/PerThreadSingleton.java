package Singleton.PerThread;

public class PerThreadSingleton {
    private static ThreadLocal<PerThreadSingleton> threadInstance = ThreadLocal.withInitial(PerThreadSingleton::new);

    private long id;
    public static PerThreadSingleton getThreadInstance() {
        return threadInstance.get();
    }

    public long getId() {
        return id;
    }

    public static PerThreadSingleton getInstance() {
        return threadInstance.get();
    }
    private PerThreadSingleton() {
        id = Thread.currentThread().getId();
    }
}
