/**
 * The heart of our decorator pattern: The component we've to decorate!
 */
public abstract class Component {
    protected String description = "Unknown pc";

    // This method is not abstract because you can don't reimplement
    // the getDescription class (since it's the base and not the decorator)
    public String getDescription() {
        return description;
    }

    public abstract int cost();
}
