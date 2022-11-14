package streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StreamEx4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(1);
        list.add(6);
        list.add(3);
        list.add(9);

        int result = list.stream().reduce((accumulator, element)
                -> accumulator * element).get();
        System.out.println(result);

        int result1 = list.stream().reduce(1,(accumulator, element)
                -> accumulator * element);
        System.out.println(result1);

        List<Integer> list2 = new ArrayList<>();
        Optional<Integer> result2 = list2.stream().reduce((accumulator, element)
                -> accumulator * element);
        if (result2.isPresent())
            System.out.println(result2.get());
        else
            System.out.println("Not present");

        List<String> listString = new ArrayList<>();
        listString.add("privet");
        listString.add("kak dela?");
        listString.add("OK");
        listString.add("poka");

        String result3 = listString.stream().reduce((a,e)->
                a+ " "+ e).get();
        System.out.println(result3);
    }
}
