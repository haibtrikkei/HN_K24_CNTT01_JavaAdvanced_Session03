package demo_stream_api;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Demo_SapXep {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int n;

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhập số phần tử: ");
            n = sc.nextInt();
            if (n < 1) {
                System.out.println("Nhập lại");
            }
        } while (n < 1);

        Random rand = new Random();
        System.out.println("Danh sách ban đầu: ");
        for (int i = 0; i < n; i++) {
            list.add(rand.nextInt(100));
            System.out.print(list.get(i) + "\t");
            if ((i + 1) % 24 == 0) {
                System.out.println();
            }
        }

        //Sắp xếp và in ra:
        System.out.println("\n\nDanh sách sắp xếp giảm dần: ");
        AtomicInteger count = new AtomicInteger();
        list.stream().sorted(Comparator.reverseOrder()).forEach(e ->
                {
                    System.out.print(e + "\t");
                    count.getAndIncrement();
                    if (count.get() % 24 == 0) {
                        System.out.println();
                    }
                }
        );
    }
}
