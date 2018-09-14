/**
 * Just a lovely linux UI.
 */
public class UIConcreteLinux extends UIAbstractProduct {

    public UIConcreteLinux() {
        System.out.println("Concrete Linux: Debian is here!");
    }

    @Override
    public void drawWindow() {
        System.out.println("Concrete Linux draw: BSOD is not allowed here. I prefer freeze all and see ya :P");
    }
}
