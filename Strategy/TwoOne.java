package Strategy;

import java.util.List;

public class TwoOne implements ListConverter {

    @Override
    public String listToString(List<String> l) {
        String string = "";
        for (int i = 0; i < l.size(); i++) {
            string += l.get(i);
            if ((i + 1) % 2 == 0) {
                string += "\n";
            }
        }

        return string;
    }

}
