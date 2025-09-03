public class InternFactory {

    private InternFactory() {

    }

    public static Intern getIntern(String InternType, String name) {
        switch (InternType) {
            case "Sde":
                return new Sde(name);
            case "UI":
                return new Ui_Ux(name);
            default:
                throw new IllegalArgumentException("Intern type not available");
        }

    }
}
