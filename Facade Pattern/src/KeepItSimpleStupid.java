public class KeepItSimpleStupid {

    private final static String COMPLICATED_PASSWORD = "HappYFlurryUnicorn!";

    /**
     * This pattern is used for keep viable the service of the subsystem, but
     * simplify his access-point to the user whose not suppose
     * to known the whole system. Let's see an example.
     */
    public static void main(String[] args) {
        // Let's suppose your mother want connect his brand new iphone to
        // the internet, through the wi-fi

        // Without facade
        Router router = new Router();
        router.turnOn();
        router.setPassword(COMPLICATED_PASSWORD);
        router.setUp();
        Smartphone iPhone = new Smartphone();
        iPhone.turnOnWiFi();
        iPhone.connect(router, COMPLICATED_PASSWORD);
        Browser mozilla = new Browser(iPhone);
        // This seems not so easy..
        // You must know every step and his order

        System.out.println("\nSame Result..");
        // With facade - all we've to know is our iPhone
        SimplifiedFacade simplified = new SimplifiedFacade();
        simplified.easyConnect(new Smartphone());
        // Easy peasy lemon squeezy boys!
    }
}
