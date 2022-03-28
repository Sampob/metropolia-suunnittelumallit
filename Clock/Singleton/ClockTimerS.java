package Clock.Singleton;

import java.util.HashSet;
import java.util.Observable;
import java.util.Observer;
import java.util.Set;

public class ClockTimerS extends Observable {
    private static int hour = 0;
    private static int minute = 0;
    private static int second = 0;

    private Set<Observer> observers = new HashSet<Observer>();

    private static ClockTimerS instance = null;

    private ClockTimerS() {
    }

    public static ClockTimerS getInstance() {
        if (instance == null)
            instance = new ClockTimerS();
        return instance;
    }

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

        for (Observer observer : observers) {
            observer.update(this, this);
        }
    }

    public void attach(Observer o) {
        observers.add(o);
    }

    public void detach(Observer o) {
        observers.remove(o);
    }
}
