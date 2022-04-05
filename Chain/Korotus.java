package Chain;

public abstract class Korotus {
    private Korotus successor;

    public void setSuccessor(Korotus k) {
        successor = k;
    }

    public void processRequest(KorotusPyynto p) {
        if (successor != null) {
            successor.processRequest(p);
        }
    }
}
