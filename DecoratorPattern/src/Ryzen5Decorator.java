public class Ryzen5Decorator extends Decorator {
    final private String DESCRIPTION_RYZEN7 = ", a Ryzen5";
    final private int COST_RYZEN7 = 149;
    private Component component;

    public Ryzen5Decorator(Component component) {
        this.component = component;
    }

    @Override
    public String getDescription() {
        return component.getDescription() + DESCRIPTION_RYZEN7;
    }

    @Override
    public int cost() {
        return component.cost() + COST_RYZEN7;
    }
}
