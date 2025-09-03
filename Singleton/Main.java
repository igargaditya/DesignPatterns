public class Main {
    public static void main(String[] args) {

        SingletonLazy obj1 = SingletonLazy.getInstance();
        SingletonLazy obj2 = SingletonLazy.getInstance();

        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj1 == obj2);

        SingletonEager obj3 = SingletonEager.getInstance();
        SingletonEager obj4 = SingletonEager.getInstance();

        System.out.println(obj3);
        System.out.println(obj4);
        System.out.println(obj3 == obj4);

    }
}
