package Strategy;

import java.util.List;

public class ThreeOne implements ListConverter {

    @Override
    public String listToString(List<String> l) {
        String string = "";
        Object[] a = l.toArray();
        for (int i = 0; i < l.size(); i++) {
            string += a[i];
            if ((i + 1) % 3 == 0) {
                string += "\n";
            }
        }

        return string;
    }

}
