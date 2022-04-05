package Strategy;

import java.util.ArrayList;
import java.util.List;

public class ListObject {
    private List<String> words;
    private ListConverter lc;

    public ListObject(List<String> l, ListConverter lc) {
        this.words = l;
        this.lc = lc;
    }

    public ListObject(ListConverter lc) {
        this.words = new ArrayList<>();
        this.lc = lc;
    }

    public void add(String s) {
        words.add(s);
    }

    public void printList() {
        System.out.println(lc.listToString(words));
    }

    public void setStrategy(ListConverter lc) {
        this.lc = lc;
    }
}
