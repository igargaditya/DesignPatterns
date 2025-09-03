public class Main {
    public static void main(String[] args) {

        // Using IphoneCharger
        IphoneCharger lightening = new ChargerABC();

        // Using AndroidCharger
        AndroidCharger typeC = new ChargerXYZ();
        Adapater adapater = new Adapater(typeC);

        Iphone Iphone14 = new Iphone(lightening);
        Iphone Iphone15 = new Iphone(adapater);

        Iphone14.chargeIphone();
        Iphone15.chargeIphone();
    }

}
