public class Adapater implements IphoneCharger {
    private AndroidCharger typeC;

    public Adapater(AndroidCharger typeC) {
        this.typeC = typeC;
    }

    @Override
    public void charge() {
        typeC.charge();
    }

}
