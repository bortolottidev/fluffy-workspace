package CommandAdvanced;

/**
 * Let's see how parent and student work.
 */
public class Client {

    public static void main(String[] args) {
        ReceiverStudent receiver = new ReceiverStudent();
        StudentCommand command = new StudentCommand(receiver);
        InvokerParent invoker = new InvokerParent(command);
        System.out.printf("Student status: %d%n%n", receiver.getState());

        System.out.println("Do somethinggggggg!");
        invoker.doSomethingCmon();
        System.out.printf("Student status: %d%n%n", receiver.getState());
        System.out.println("Hey! Come back to work!");
        invoker.goBack();
        System.out.printf("Student status: %d%n%n", receiver.getState());

        System.out.println("Do somethinggggggg!");
        invoker.doSomethingCmon();
        System.out.printf("Student status: %d%n%n", receiver.getState());
        System.out.println("Hey! Come back to work!");
        invoker.goBack();
        System.out.printf("Student status: %d%n%n", receiver.getState());
    }
}
