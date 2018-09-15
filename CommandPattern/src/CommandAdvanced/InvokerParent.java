package CommandAdvanced;

public class InvokerParent {
    VeryAdvancedCommand command;

    public InvokerParent(VeryAdvancedCommand command) {
        this.command = command;
    }

    /* A parent dont need to know what the student is doing, he has to study! */
    public void doSomethingCmon() {
        System.out.printf("%s%n",
                Thread.currentThread().getStackTrace()[1]);
        command.execute();
    }

    /* Ok this seems strange..*/
    public void goBack() {
        System.out.printf("%s%n",
                Thread.currentThread().getStackTrace()[1]);
        command.undo();
    }
}
