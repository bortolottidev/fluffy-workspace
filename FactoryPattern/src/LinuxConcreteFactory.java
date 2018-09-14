/**
 * The real Linux factory! yooo
 * This class pop out a nice linux user interface every time i require,
 * though the factory method init().
 * The user who use it will never know i'm passing out a UIConcreteLinux and not a UIConcreteWindow.
 */
public class LinuxConcreteFactory extends UIAbstractFactory {

    // I'm concrete!
    public LinuxConcreteFactory() {
    }

    @Override
    public UIAbstractProduct init() {
        System.out.println("Linux Factory init: Here is your brand new linux!");
        return new UIConcreteLinux();
    }
}
