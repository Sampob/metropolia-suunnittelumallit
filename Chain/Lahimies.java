package Chain;

public class Lahimies extends Korotus {
    private final double allowable = 1.02;

    public void processRequest(KorotusPyynto p) {
        if (p.getAmount() / p.getBase() < allowable) {
            System.out.println("Lähiesimies antaa korotuksen");
            System.out.println("Korotus " + p.getBase() + "€, " + p.getAmount() + "€:roon");
        } else {
            super.processRequest(p);
        }
    }
}
