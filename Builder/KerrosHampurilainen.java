package Builder;

import java.util.ArrayList;
import java.util.List;

public class KerrosHampurilainen {
    private ArrayList<String> parts = new ArrayList<>();

    public void addPart(String s) {
        parts.add(s);
    }

    public void addParts(List<String> s) {
        parts.addAll(s);
    }

    @Override
    public String toString() {
        return String.join(", ", parts);
    }
}
