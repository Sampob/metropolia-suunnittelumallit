package Proxy;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Image> valokuvakansio = new ArrayList<>();

        valokuvakansio.add(new ProxyImage("image1.png", "Kissakuva"));
        valokuvakansio.add(new ProxyImage("im2_1.jpg", "Juhannus21"));
        valokuvakansio.add(new ProxyImage("rnfwe.png", "Pena sammuneena"));
        valokuvakansio.add(new ProxyImage("300423.png", "Vabbu"));

        valokuvakansio.get(0).showData();
    }
}
