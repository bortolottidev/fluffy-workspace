public class Smartphone {
    private boolean wifiReceiverOn = false;

    public Smartphone() {
    }

    public void turnOnWiFi() {
        wifiReceiverOn = true;
    }

    public void connect(Router router, String password) {
        if (wifiReceiverOn) {
            // Boring code
            // I'm setting up the connect with the router, blabla..
        }
    }
}
