/**
 * Let's see how the Singleton pattern make us sure we're working with a unique
 * instantiation of a class.
 */
public class IsItReallyUnique {

    private static void isTheSame(Object obj1, Object obj2) {
        if (obj1.equals(obj2)) {
            System.out.println("It's the same coffee! :(");
        } else {
            System.out.println("It's different coffe, i love it!");
        }
    }

    public static void main(String[] args) {
        System.out.print("Pojo objects: ");
        Coffee coffee1 = new DifferentCoffeeEverytime() ;
        Coffee coffee2 = new DifferentCoffeeEverytime() ;
        isTheSame(coffee1, coffee2);

        // Let's retry by using the singleton class
        // I can't use it like another pojo, i've to call it though getInstance!
        System.out.print("Singleton objects: ");
        coffee1 = SingletonCoffee.getInstance();
        coffee2 = SingletonCoffee.getInstance() ;
        isTheSame(coffee1, coffee2);
    }
}
