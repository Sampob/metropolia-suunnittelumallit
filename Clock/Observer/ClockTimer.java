package Clock.Observer;

import java.util.Observable;
import java.util.Observer;

@SuppressWarnings("all")
public class ClockTimer extends Observable {

    private static int hour = 0;
    private static int minute = 0;
    private static int second = 0;

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    void tick() {
        if (second < 59) {
            second++;
        } else if (minute < 59) {
            second = 0;
            minute++;
        } else {
            second = 0;
            minute = 0;
            hour++;
        }

        setChanged();
        notifyObservers();
    }

}
