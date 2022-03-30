package Decorator;

import Decorator.Data.SomeData;

public class Main {
    public static void main(String[] args) {
        SomeData data = new SomeData("dataa tai jotain");

        FileInterface fi = new FileSecret(new FileNormal());

        fi.save(data);

        System.out.println(fi.load());

    }
}
