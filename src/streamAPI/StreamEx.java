package streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class StreamEx {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("privet");
        list.add("kak dela?");
        list.add("OK");
        list.add("poka");

        List<Integer> list2 = list.stream().map(s -> s.length()).collect(Collectors.toList());
        System.out.println(list2);

        Set<String> set = new TreeSet<>();
        set.add("privet");
        set.add("kak dela?");
        set.add("OK");
        set.add("poka");

        Set<String> set2 = set.stream().map(
                element -> element + element.length())
                .collect(Collectors.toSet());
        System.out.println(set2);
    }
}
