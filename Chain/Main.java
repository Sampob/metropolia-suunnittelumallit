package Chain;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Lahimies l = new Lahimies();
        Paallikko p = new Paallikko();
        Toimari t = new Toimari();

        l.setSuccessor(p);
        p.setSuccessor(t);

        Scanner s = new Scanner(System.in);

        try {
            while (true) {
                System.out.println("Enter your current salary.");
                System.out.print(">");
                double base = Double.parseDouble(s.nextLine());
                System.out.println("Enter the amount to check who should approve your expenditure.");
                System.out.print(">");
                double value = Double.parseDouble(s.nextLine());
                l.processRequest(new KorotusPyynto(value, base));
            }
        } catch (Exception e) {
            System.exit(1);
        }

        s.close();
    }
}
