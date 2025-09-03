public class BasePizza implements Pizza {
    @Override
    public String getDetails() {
        return "Pizza";
    }

    @Override
    public int getPrice() {
        return 100;
    }

}
