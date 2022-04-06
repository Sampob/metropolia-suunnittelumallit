package Clock.Observer;

@SuppressWarnings("all")

public class Main {
    public static void main(String[] args) {
        ClockTimer ct = new ClockTimer();

        DigitalClock dc = new DigitalClock(ct);

        for (int i = 0; i < 3750; i++) {
            ct.tick();
        }
    }
}
