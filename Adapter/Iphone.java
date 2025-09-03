class Iphone {
    private IphoneCharger lighteningCharger;

    public Iphone(IphoneCharger lighteningCharger) {
        this.lighteningCharger = lighteningCharger;
    }

    public void chargeIphone() {
        lighteningCharger.charge();
    }
}