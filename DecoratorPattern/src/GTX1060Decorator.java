public class GTX1060Decorator extends Decorator {
    final private String DESCRIPTION_NVIDIA = ", a Nvidia GTX1060";
    final private int COST_NVIDIA = 299;
    private Component component;

    public GTX1060Decorator(Component component) {
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
