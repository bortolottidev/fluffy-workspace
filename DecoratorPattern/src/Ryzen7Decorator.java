/**
 * An example of decorator! He'll use the component instance through variable for
 * use the original function and add his responsability.
 * Thanks to this, we can add sooo many decorator we want, in every combination we desire!
 */
public class Ryzen7Decorator extends Decorator {
    private final int COST_RYZEN7 = 219;
    private final String DESCRIPTION_RYZEN7 = ", a Ryzen7";
    private Component component;

    public Ryzen7Decorator(Component component) {
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
