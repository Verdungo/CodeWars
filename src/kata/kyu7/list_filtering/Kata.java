package kata.kyu7.list_filtering;

import java.util.List;
import java.util.stream.Collectors;

public class Kata {
    public static List<Object> filterList(final List<Object> list) {
        return list.stream().filter(o -> o.getClass().equals(Integer.class)).collect(Collectors.toList());
    }
}
