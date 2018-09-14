/**
 * Thanks to this class, the desperate housewife can only call this class,
 * insert his smartphone, and wait while he do all the dirty work.
 * Much more easier! :D
 * At the same time, this interface don't hide the subsystem so the expert user
 * can still call it for doing his custom call with a super-safely banana password
 * instead of this one.
 */
public class SimplifiedFacade {
    public SimplifiedFacade() {
    }

    public void easyConnect(Smartphone smartphone) {
        Router router = new Router();
        router.turnOn();
        router.setPassword("password");
        router.setUp();
        Smartphone iPhone = new Smartphone();
        iPhone.turnOnWiFi();
        iPhone.connect(router, "password");
        Browser mozilla = new Browser(iPhone);
    }
}
