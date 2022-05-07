package Iterator;

import java.util.Iterator;
import java.util.List;

public class TPrint extends Thread {
    List<String> list;
    Iterator<String> it;
    String name;

    public TPrint(List<String> l, Iterator<String> i, String s) {
        list = l;
        it = i;
        name = s;
    }

    @Override
    public void run() {
        System.out.println(name + " is starting");
        String i;
        while (it.hasNext()) {
            i = it.next();
            if (i.equals("toka")) {
                it.remove();
                System.out.println(name + " removed " + i);
            } else {
                System.out.println(i + ", " + name);
            }
        }
        System.out.println(name + " is done");
    }
}
