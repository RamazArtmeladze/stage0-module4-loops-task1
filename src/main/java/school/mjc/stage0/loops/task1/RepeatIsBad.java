package school.mjc.stage0.loops.task1;

public class RepeatIsBad {

    @SuppressWarnings("java:S106")
    public void repeatIsBad() {
        printMessage(1, 20);
    }

    private void printMessage(int times, int target) {
        if (times <= target) {
            System.out.println("writing the same code doesn't have much impact, and it's also time consuming");
            printMessage(times + 1, target);
        }
    }

    public static void main(String[] args) {
        RepeatIsBad repeater = new RepeatIsBad();
        repeater.repeatIsBad();
    }
}



