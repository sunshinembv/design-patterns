package singleton;

public class SingletonSync {
    private static SingletonSync instance;

    private SingletonSync() {
    }

    public static SingletonSync getInstance() {
        if (instance == null) {
            synchronized (SingletonSync.class) {
                if (instance == null) {
                    instance = new SingletonSync();
                }
            }
        }
        return instance;
    }
}
