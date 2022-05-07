package Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ThreadIterator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("eka");
        list.add("toka");
        list.add("kolmas");

        Iterator<String> i = list.iterator();
        Iterator<String> i2 = list.iterator();

        TPrint q = new TPrint(list, i, "1");
        TPrint w = new TPrint(list, i, "2");

        q.start();
        w.start();

    }
}
