package CommandSimple;

public class ReceiverWorker {
    private static final int REALLY_HARD = 3;
    private static final int HARDER = 2;
    private static final int HARD = 1;
    private static final int ZZZ = 0;
    private int workIntensity;

    public ReceiverWorker(){
        workIntensity = ZZZ;
    }

    public void work() {
        workIntensity = HARD;
        System.out.println("ReceiverWorker: work - i'll work hard!");
    }

    public void workMore() {
        workIntensity = HARDER;
    }

    public void imAmNotSeeingYouWork() {
        workIntensity = REALLY_HARD;
    }

    public void rest() {
        workIntensity = ZZZ;
        System.out.printf("%s - zzzz finally!%n",
                Thread.currentThread().getStackTrace()[1]);
    }

    public int getIntensity() {
        return workIntensity;
    }
}
