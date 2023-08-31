package school.mjc.stage0.loops.task1;

import java.util.Observable;
import java.util.Observer;

class RepeatIsBad extends Observable {
    private static final int MAX_COUNT = 20;
    private int remainingCount = MAX_COUNT;

    @SuppressWarnings("java:S106")
    public void repeatIsBad() {
        addObserver(new Observer() {
            @Override
            public void update(Observable o, Object arg) {
                if (remainingCount > 0) {
                    System.out.println("writing the same code doesn't have much impact, and it's also time consuming");
                    remainingCount--;
                    setChanged();
                    notifyObservers();
                }
            }
        });

        setChanged();
        notifyObservers();
    }

    public static void main(String[] args) {
        RepeatIsBad repeater = new RepeatIsBad();
        repeater.repeatIsBad();
    }
}


