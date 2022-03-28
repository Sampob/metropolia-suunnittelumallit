package Observer;

public class MainSingleton {
    public static void main(String[] args) {
        DigitalClockS dc = new DigitalClockS(ClockTimerS.getInstance());
        DigitalClockS tm = new DigitalClockS(ClockTimerS.getInstance());

        ClockTimerS.getInstance().tick();
    }
}
