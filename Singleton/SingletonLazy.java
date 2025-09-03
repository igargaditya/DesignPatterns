public class SingletonLazy {
    private static SingletonLazy instance;

    private SingletonLazy() {

    }

    // Lazy Initilisation
    public static SingletonLazy getInstance() {
        if (instance == null) {
            instance = new SingletonLazy();
        }
        return instance;
    }

}
