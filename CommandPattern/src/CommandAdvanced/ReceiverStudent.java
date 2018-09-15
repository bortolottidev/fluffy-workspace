package CommandAdvanced;

import java.util.Random;

public class ReceiverStudent {
    private static final int CHILL = 0;
    private static final int YOLO = 1;
    private static final int STUDYING = 2;
    private static final int PRAYING_FOR_NEXT_EXAM = 3;
    private static Random rand = new Random();
    private int state;

    public ReceiverStudent() {
        state = CHILL;
    }

    public void randomStudentThing() {
        state = rand.nextInt();
        if (state < 0) {
            state = -state;
        }
        state %= 4;
    }

    public int getState() {
        System.out.printf("%s%n",
                Thread.currentThread().getStackTrace()[1]);
        return state;
    }

    public void setState(int state) {
        System.out.printf("%s%n",
                Thread.currentThread().getStackTrace()[1]);
        this.state = state;
    }
}
