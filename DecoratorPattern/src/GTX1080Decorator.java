public class GTX1080Decorator extends Decorator {
    final private String DESCRIPTION_NVIDIA = ", a Nvidia GTX1080";
    final private int COST_NVIDIA = 399;
    private Component component;

    public GTX1080Decorator(Component component) {
        this.component = component;
    }

    @Override
    public String getDescription() {
        return component.getDescription() + DESCRIPTION_NVIDIA;
    }

    @Override
    public int cost() {
        return component.cost() + COST_NVIDIA;
    }
}
