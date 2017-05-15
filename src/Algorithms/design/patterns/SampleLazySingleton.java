package Algorithms.design.patterns;


public class SampleLazySingleton {

    private static SampleLazySingleton mInstance = null;

    private SampleLazySingleton() { }

    public static SampleLazySingleton getInstance() {
        if(mInstance == null) {
            return new SampleLazySingleton();
        }

        return mInstance;
    }
}
