package Chain;

public class Paallikko extends Korotus {
    private final double allowable = 1.05;

    public void processRequest(KorotusPyynto p) {
        if (p.getAmount() / p.getBase() < allowable) {
            System.out.println("Yksikön päällikkö antaa korotuksen");
            System.out.println("Korotus " + p.getBase() + "€, " + p.getAmount() + "€:roon");
        } else {
            super.processRequest(p);
        }
    }
}
