package Clock.Singleton;

import java.util.Observable;
import java.util.Observer;

public class DigitalClockS implements Observer {

    public DigitalClockS(ClockTimerS ct) {
        ct.attach(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o == ClockTimerS.getInstance()) {
            draw();
        }
    }

    private void draw() {
        ClockTimerS timer = ClockTimerS.getInstance();

        int hour = timer.getHour();
        int minute = timer.getMinute();
        int second = timer.getSecond();

        System.out.println(hour + "h " + minute + "min " + second + "s");
    }

}
