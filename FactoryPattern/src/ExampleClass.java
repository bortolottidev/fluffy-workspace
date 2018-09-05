import java.util.Random;

/**
 * By using the factory pattern, we can split the details of object creation
 * from the object using, so we can respect the "identify the aspect that vary and
 * separate them from what stays the same" principle.
 */
public class ExampleClass {
    // Random int between zero and three
    int randZeroToNine = new Random().nextInt() % 3 ;

    // Implementation change everytime, but thanks to factory, i cant still refer
    // to the interface and ignore the detail of create
    UI userInterface = UIFactory(randZeroToNine);

    userInterface.createWindow();
    userInterface.drawOnWindow();
    userInterface.click();
}
