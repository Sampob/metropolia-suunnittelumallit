package Strategy;

import java.util.List;

public class EveryOne implements ListConverter {

    @Override
    public String listToString(List<String> l) {
        String string = "";
        for (String s : l) {
            string += s + "\n";
        }

        return string;
    }

}
