package CommandAdvanced;

import java.lang.reflect.Method;
import java.util.Stack;

/**
 * The command class implemented. Here is where the decouple come.
 */
public class StudentCommand implements VeryAdvancedCommand {
    private ReceiverStudent student;
    private int previousState;
    private Stack<Method> stack;

    public StudentCommand(ReceiverStudent student) {
        this.student = student;
        previousState = student.getState();
        stack = new Stack<>();
    }

    @Override
    public void execute() {
        System.out.printf("%s%n",
                Thread.currentThread().getStackTrace()[1]);
        previousState = student.getState();
        student.randomStudentThing();
        store();
    }

    @Override
    public void undo() {
        System.out.printf("%s%n",
                Thread.currentThread().getStackTrace()[1]);
        student.setState(previousState);
    }

    @Override
    public void store() {
        // TODO
    }
}
