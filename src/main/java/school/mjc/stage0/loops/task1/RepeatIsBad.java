package school.mjc.stage0.loops.task1;

public class RepeatIsBad {
    private static final int MAX_COUNT = 0;

    @SuppressWarnings("java:S106")
    public void repeatIsBad(){
        printMessage(MAX_COUNT);
    }

    private void printMessage(int count) {
        if (count > 0) {
            System.out.println("writing the same code doesn't have much impact, and it's also time consuming");
            printMessage(count + 1);
        }
    }
}

