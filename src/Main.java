import edc.Animal;
import edc.Dog;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Lena");
        strings.add("Kolya");
        strings.add("Pasha");
        strings.add("Lena");
        System.out.println(strings);

        List<String> strings2 = new ArrayList<>();
        strings2.add("Lena");
        strings.removeAll(strings2);
        System.out.println(strings);

    }

    public static void surf(List<? extends Animal> list){
        for (Animal animal: list){
            System.out.println(animal);
        }
    }
}
