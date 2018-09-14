public class WindowsConcreteFactory extends UIAbstractFactory {

    public WindowsConcreteFactory(){}

    @Override
    public UIAbstractProduct init() {
        System.out.println("Window Factory init: Hurrr durr here yours product!");
        return new UIConcreteWindow();
    }
}
