public class SingletonEager {

    // Eager Initlisation
    private static SingletonEager instance = new SingletonEager();

    private SingletonEager() {

    }

    public static SingletonEager getInstance() {
        return instance;
    }

}
