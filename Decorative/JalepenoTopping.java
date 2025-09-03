public class JalepenoTopping extends BasePizza {

    private Pizza pizza;

    public JalepenoTopping(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDetails() {
        return "Jalepeno" + " " + pizza.getDetails();
    }

    @Override
    public int getPrice() {
        return 50 + pizza.getPrice();
    }

}
