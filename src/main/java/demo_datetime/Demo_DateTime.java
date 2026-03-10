package demo_datetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Demo_DateTime {
    public static void main(String[] args) {
        LocalDate birthday;

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào ngày sinh của bạn: ");
        birthday = LocalDate.parse(sc.nextLine(), formatter);

        System.out.println("Ngày sinh của bạn: "+birthday);
        System.out.println("Ngày sinh có định dạng: "+birthday.format(formatter));
    }
}
