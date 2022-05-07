package Prototype;

public class TuntiViisari implements Cloneable {
    private int tunti;

    public void setTunti(int h) {
        tunti = h;
    }

    public int getTunti() {
        return tunti;
    }

    public TuntiViisari(int h) {
        tunti = h;
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
