package Clock.SingletonNew;

@SuppressWarnings("all")

public class MainSingleton {
    public static void main(String[] args) {
        DigitalClockS dc = new DigitalClockS(ClockTimerS.getInstance());
        DigitalClockS tm = new DigitalClockS(ClockTimerS.getInstance());

        for (int i = 0; i < 5000; i++) {
            ClockTimerS.getInstance().tick();
        }
    }
}
