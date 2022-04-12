package Builder;

public class BigMac {

    private StringBuilder burger = new StringBuilder();

    public void addPart(String s) {
        burger.append(s);
        burger.append(", ");
    }

    @Override
    public String toString() {
        return burger.toString();
    }
}
