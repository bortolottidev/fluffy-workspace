public class WithDecorator {

    /**
     * Let's suppose you have to implement a Basket for your hardware website.
     * The client can choose the component for his future pc, then dream on it,
     * see their description and their total cost.
     */
    public static void main(String[] args) {

        // Every pc start from a mobo!
        Component pc1 = new AsusMOBOComponent();
        Component pc2 = new ROGMOBOComponent();

        // Let's just add Processor and Graphic card
        pc1 = new Ryzen5Decorator(pc1);
        pc2 = new Ryzen7Decorator(pc2);
        pc1 = new GTX1080Decorator(pc1);
        pc2 = new GTX1060Decorator(pc2);
        pc2 = new GTX1060Decorator(pc2);

        // A bit not so DRY but soooo flexible

        // Now i can compare them and dreaaaaaam
        System.out.println("First pc and his cost");
        System.out.println(pc1.getDescription() + ": " +
                pc1.cost() + "$");
        System.out.println("Second pc and his cost");
        System.out.println(pc2.getDescription() + ": " +
                pc2.cost() + "$");
    }
}
