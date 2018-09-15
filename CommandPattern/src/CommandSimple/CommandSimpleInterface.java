package CommandSimple;

/**
 * The command class decouple receiver from invoker of action.
 * Our client must simple call the execute.
 * In this simple case we've a function interface, and we can replace every implementation
 * by using the lambda.
 */
public interface CommandSimpleInterface {
    void execute();
}
