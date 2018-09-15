package CommandSimple;

/**
 * This class use the functional interface of command.
 */
public class Invoker {
    private CommandSimpleInterface command;

    public Invoker() {
        command = () -> {}; // No command if not assigned
    }

    public void setCommand(CommandSimpleInterface command) {
        this.command = command;
    }

    public void doThings() {
        command.execute();
    }
}
