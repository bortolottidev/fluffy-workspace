package CommandAdvanced;

/**
 * Very advanced Command interface.
 * It can execute, undo, store and load action! WOW
 */
public interface VeryAdvancedCommand {
    void execute();

    /**
     * Go back to the previous state of the receiver
     */
    void undo();

    /**
     * Let's store the log of our command
     */
    void store() throws NoSuchMethodException;
}
