package Algorithms.design.patterns;

public class ConcurrentLazySingleton {

    private ConcurrentLazySingleton() { }

    private static class LazyHolder {
        static final ConcurrentLazySingleton INSTANCE = new ConcurrentLazySingleton();
    }

    public static ConcurrentLazySingleton getInstance() {
        return LazyHolder.INSTANCE;
    }
}
