import java.util.Random;

/**
 * By using the factory pattern, we can split the details of object creation
 * from the object using, so we can respect the "identify the aspect that vary and
 * separate them from what stays the same" principle.
 */
public class ExampleClass {

    private static void genericOperationICanDoOnEveryProduct(UIAbstractProduct product) {
        product.createWindow();
        product.drawWindow();
        product.click();
    }

    /**
     * In this example we can see the dependecy inversion principle applyed.
     * Our main class depends only on UIAbstractProduct.
     * Alternative was to depend from every single concrete product.
     * More the product, more the depend, more the risk and update necessary.
     * Thank you factory pattern! :D
     */
    public static void main(String[] args) {
        UIAbstractFactory linuxFactory = new LinuxConcreteFactory();
        UIAbstractFactory windowsFactory = new WindowsConcreteFactory();

        // Implementation change everytime, but thanks to factory, i cant still refer
        // to the interface and ignore the detail of create
        UIAbstractProduct linux = linuxFactory.init();
        // Thanks to this pattern we can program to an interface,
        // and depend upon abstractions instad of concrete classes.
        // Dependency inversion, baby!
        genericOperationICanDoOnEveryProduct(linux);
        System.out.println("------");
        UIAbstractProduct windows = windowsFactory.init();
        genericOperationICanDoOnEveryProduct(windows);
    }

}
