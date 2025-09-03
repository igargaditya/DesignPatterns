public class Main {
    public static void main(String[] args) {
        Intern intern1 = InternFactory.getIntern("UI", "Aditya");
        Intern intern2 = InternFactory.getIntern("Sde", "Pearl");

        System.out.println(intern1.getName() + " -> " + intern1.getPosition() + " -> " + intern1.getSalary());
        System.out.println(intern2.getName() + " -> " + intern2.getPosition() + " -> " + intern2.getSalary());

    }
}
