package school.mjc.stage0.loops.task1;

public class RepeatIsBad {

    @SuppressWarnings("java:S106")
    public void repeatIsBad() {
        printMessage(20);
    }

    private void printMessage(int times) {
        if (times > 0) {
            System.out.println("writing the same code doesn't have much impact, and it's also time-consuming");
            printMessage(times - 1);
        }
    }

    public static void main(String[] args) {
        RepeatIsBad repeater = new RepeatIsBad();
        repeater.repeatIsBad();
    }
}


