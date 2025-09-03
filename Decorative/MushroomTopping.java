public class MushroomTopping extends BasePizza {
    private Pizza pizza;

    public MushroomTopping(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDetails() {
        return "Mushroom" + " " + pizza.getDetails();
    }

    @Override
    public int getPrice() {
        return 20 + pizza.getPrice();
    }

}
