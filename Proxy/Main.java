package Proxy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Image> valokuvakansio = new ArrayList<>();

        int current;
        final String menuPrompt = "1. Next image\n2. Previous image\n3. Load picture\n4. Exit\n> ";

        boolean w = true;

        Scanner sc = new Scanner(System.in);

        valokuvakansio.add(new ProxyImage("image1.png", "Kissakuva"));
        valokuvakansio.add(new ProxyImage("im2_1.jpg", "Juhannus21"));
        valokuvakansio.add(new ProxyImage("rnfwe.png", "Pena sammuneena"));
        valokuvakansio.add(new ProxyImage("300423.png", "Vabbu"));

        current = 0;

        while(w) {
            System.out.println("\nCurrent image: " + valokuvakansio.get(current).showData());
            System.out.print(menuPrompt);

            switch(sc.nextInt()) {
                case 1:
                    if(1 + current < valokuvakansio.size()) {
                        current++;
                    } else {
                        System.out.println("Last picture\n");
                    }
                    break;
                case 2: 
                    if(current > 0) {
                        current--;
                    } else {
                        System.out.println("First picture\n");
                    }
                    break;
                case 3:
                    System.out.println();
                    valokuvakansio.get(current).displayImage();
                    break;
                case 4: 
                    System.out.println("Closing...\n");
                    w = false;
                    break;
                default:
                    System.out.println("Unknown command\n");
                    break;
            }
        }
        sc.close();
    }
}
