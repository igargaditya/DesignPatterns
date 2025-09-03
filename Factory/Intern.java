public abstract class Intern {

    private String name;

    public Intern(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public abstract String getPosition();

    public abstract int getSalary();

}