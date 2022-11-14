package streamAPI;

import java.util.ArrayList;
import java.util.List;

public class StreamEx3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("privet");
        list.add("kak dela?");
        list.add("OK");
        list.add("poka");

        list.stream().forEach(element -> {element+=element.length();
            System.out.println(element);});
    }
}
