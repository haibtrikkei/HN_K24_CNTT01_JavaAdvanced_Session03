package demo_stream_api;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class HienThiSoNguyenTo {
    public static void main(String[] args) {
        int arr[], n;

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhập số phần tử của mảng: ");
            n = sc.nextInt();
            if (n < 1) {
                System.out.println("Nhập lại số phần tử của mảng");
            }
        } while (n < 1);

        arr = new int[n];

        Random r = new Random();
        System.out.println("Mảng ban đầu: ");
        for (int i = 0; i < n; i++) {
            arr[i] = r.nextInt(100);
            System.out.print(arr[i] + "\t");
            if ((i + 1) % 24 == 0) {
                System.out.println();
            }
        }

        //Hiển thị các phần tử là số của mảng:
        System.out.println("\nCác phần tử là số nguyên tố của mảng: ");
        AtomicInteger count = new AtomicInteger();

        Arrays.stream(arr).parallel().forEach(e -> {
            //Kiểm tra phần tử e có là nguyên tố hay không?
            boolean check = true;
            if (e < 2) {
                check = false;
            } else {
                for (int i = 2; i <= Math.sqrt(e); i++) {
                    if (e % i == 0) {
                        check = false;
                        break;
                    }
                }
            }
            if (check) {
                System.out.print(e + "\t");
                count.getAndIncrement();
                if (count.get() % 24 == 0) {
                    System.out.println();
                }
            }
        });
    }
}
