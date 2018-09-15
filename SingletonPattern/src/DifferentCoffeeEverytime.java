/**
 * This class don't use the Singleton pattern: we can call it with new
 * and we're not sure about the uniqueness of his instantiation.
 */
public class DifferentCoffeeEverytime implements Coffee {
    public DifferentCoffeeEverytime() {}
}
