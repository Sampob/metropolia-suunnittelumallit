package Prototype;

public class Kello implements Cloneable {
    private MinuuttiViisari min;
    private TuntiViisari hour;

    public Kello(MinuuttiViisari m, TuntiViisari h) {
        this.min = m;
        this.hour = h;
    }

    public Kello clone() {
        Kello k = null;
        try {
            k = (Kello) super.clone();
            k.min = (MinuuttiViisari) min.clone();
            k.hour = (TuntiViisari) hour.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return k;
    }

    public void advanceTime() {
        if (min.getMinuutti() == 59) {
            min.setMinuutti(0);
            hour.setTunti(hour.getTunti() + 1);
        } else {
            min.setMinuutti(min.getMinuutti() + 1);
        }
    }

    @Override
    public String toString() {
        return "Tunti: " + hour.getTunti() + ", minuutti: " + min.getMinuutti();
    }
}