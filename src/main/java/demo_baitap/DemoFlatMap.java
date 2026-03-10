package demo_baitap;

import java.util.Arrays;
import java.util.List;

public class DemoFlatMap {
    public static void main(String[] args) {
        List<List<String>> list = Arrays.asList(
                Arrays.asList("java", "backend"),
                Arrays.asList("python", "data")
        );

        List<String> list1 = list.stream().flatMap(l -> l.stream()).toList();
        System.out.println(list1);

    }
}
