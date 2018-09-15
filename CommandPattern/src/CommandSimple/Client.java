package CommandSimple;

public class Client {

    public static void main(String[] args) {
        ReceiverWorker receiver = new ReceiverWorker();
        Invoker invoker = new Invoker();
        /* What the.. ?
            Command lambda = () -> {receiver.work(); more..}
            invoker.setCommand(lambda);
         */
        invoker.setCommand(receiver::work);
    }

}
