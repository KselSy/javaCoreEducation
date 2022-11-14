package streamAPI;

import java.util.stream.Stream;

public class StreamEx7 {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1,2,3,4,5,6,5,4,3,2,1);
        Stream<Integer> stream2 = Stream.of(1,2,3,4,5);
        Stream<Integer> stream3 = Stream.of(6,5,4,3,2,1);
        Stream<Integer> stream4 = Stream.concat(stream2,stream3);
        Stream<Integer> stream5 = Stream.of(1,2,3,4,5,6,5,4,3,2,1);
        Stream<Integer> stream6 = Stream.of(1,2,3,4,5,6,5,4,3,2,1);
        stream4.forEach(System.out::println);
        System.out.println();
        stream1.distinct().forEach(System.out::println);
        System.out.println();
//        System.out.println(stream5.count());
        System.out.println(stream5.distinct().count());
        System.out.println();
        System.out.println(stream6.distinct().peek(System.out::println).count());
    }
}
