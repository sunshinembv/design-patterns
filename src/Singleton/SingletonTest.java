package Singleton;

public class SingletonTest {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println("Singleton 1: " + singleton.toString());
        singleton = Singleton.getInstance();
        System.out.println("Singleton 2: " + singleton.toString());

        Thread thread = new Thread(() -> {
            SingletonSync singletonSync = SingletonSync.getInstance();
            System.out.println("SingletonSync 1: " + singletonSync.toString());
        });

        Thread thread1 = new Thread(() -> {
            SingletonSync singletonSync = SingletonSync.getInstance();
            System.out.println("SingletonSync 2: " + singletonSync.toString());
        });

        thread.start();
        thread1.start();
    }
}
