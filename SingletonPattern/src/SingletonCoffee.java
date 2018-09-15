/**
 * Where the magic happens.
 */
public class SingletonCoffee implements Coffee {
    // Variable for the collect the unique instantiation
    private volatile static SingletonCoffee uniqueCoffee;

    // Private constructor sounds crazy but assure us nobody can call the new
    private SingletonCoffee (){};

    // The method though i can get the coffee!
    public static SingletonCoffee getInstance() {
        // First request is prone to multi-thread error.
        // We'll use synchronize to fix this
        if (uniqueCoffee == null){
            synchronized (SingletonCoffee.class) {
                if (uniqueCoffee == null) {
                    uniqueCoffee = new SingletonCoffee();
                }
            }
        }
        return uniqueCoffee;
    }

    /**
     * A simpliest solution to multi-thread error: EAGER!
     * private static SingletonCoffee uniqueCoffee = new SingletonCoffee();
     * [..] getInstance() {
     *     return uniqueCoffee;
     * }
     */

}
