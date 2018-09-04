public class Router {

    private String password = "new password";

    public Router() {
    }

    public void turnOn() {
        System.out.println("Router Setup: I'm connecting to the big cloud..");
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUp() {
        if (!password.equals("new password")) {
            System.out.println("Correct. You're able to surf the web now!");
        }
    }

}
