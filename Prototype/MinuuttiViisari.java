package Prototype;

public class MinuuttiViisari implements Cloneable {
    private int minuutti;

    public int getMinuutti() {
        return minuutti;
    }

    public void setMinuutti(int minuutti) {
        this.minuutti = minuutti;
    }

    public MinuuttiViisari(int i) {
        minuutti = i;
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
