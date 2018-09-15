package CommandSimple;

public class Client {

    public static void main(String[] args) {
        ReceiverWorker receiver = new ReceiverWorker();
        Invoker invoker = new Invoker();
        Invoker differentInvoker = new Invoker();
        /* What the.. ?
            Command lambda = () -> {receiver.work(); more..}
            invoker.setCommand(lambda);

            Longer alternative? Create a class. See Command advanced for more, where i'm forced to do it.
         */
        invoker.setCommand(receiver::work);
        differentInvoker.setCommand(receiver::rest);
        // Invoker setted, 3 2 1 go.
        invoker.doThings();
        differentInvoker.doThings();
    }

}
