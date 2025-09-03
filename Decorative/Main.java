public class Main {
    public static void main(String[] args) {

        Pizza pizza1 = new JalepenoTopping(new MushroomTopping(new BasePizza()));
        Pizza pizza2 = new CornTopping(new JalepenoTopping(new MushroomTopping(new BasePizza())));

        System.out.println(pizza1.getDetails() + "/" + pizza1.getPrice());
        System.out.println(pizza2.getDetails() + "/" + pizza2.getPrice());
    }
}
