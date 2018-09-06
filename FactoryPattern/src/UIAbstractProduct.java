/**
 * The class for the abstract product i want to generate from my factory.
 * Every class must implement or inherit his method.
 */
public abstract class UIAbstractProduct {
    public void createWindow() {
        System.out.println("Abstract UI create: Standard method creating a window..");
    }
    public abstract void drawWindow();
    public void click() {
        System.out.println("Abstract UI click: Standard annoyed random click");
    }
}
