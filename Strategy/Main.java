package Strategy;

public class Main {
    public static void main(String[] args) {
        ListObject lo = new ListObject(new EveryOne());

        lo.add("First");
        lo.add("Second");
        lo.add("Third");
        lo.add("Last");

        lo.printList();

        lo.setStrategy(new TwoOne());
        lo.printList();

        lo.setStrategy(new ThreeOne());
        lo.printList();
    }
}
