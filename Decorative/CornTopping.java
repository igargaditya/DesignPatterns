public class CornTopping extends BasePizza {
    private Pizza pizza;

    public CornTopping(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDetails() {
        return "Corn" + " " + pizza.getDetails();
    }

    @Override
    public int getPrice() {
        return 30 + pizza.getPrice();
    }

}
