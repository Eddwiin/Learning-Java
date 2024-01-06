package User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class User2 {
    static List<String> strings = new ArrayList<>();
    private int[] names;

    public User2(String fullName) {
        this.names = java.util.Arrays.stream(fullName.split(" ")).mapToInt(this::getOrAdd).toArray();
    }

    public int getOrAdd(String s) {
        int idx = strings.indexOf(s);
        if (idx != -1) return idx;
        else {
            strings.add(s);
            return strings.size() - 1;
        }
    }

    public String fullName() {
        return String.join(" ", Arrays.stream(names).mapToObj(strings::get).toArray(String[]::new));
    }
}
