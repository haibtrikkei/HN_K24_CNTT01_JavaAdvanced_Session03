package demo_datetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAccessor;

public class KhoangCachThoiGian {
    public static void main(String[] args) {
        LocalDate date1, date2;


        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        date1 = LocalDate.parse("01/01/2028", df);
        date2 = LocalDate.parse("01/01/2029", df);

        System.out.println("Năm 2028 có tổng số ngày: "+ ChronoUnit.DAYS.between(date1, date2));

        date1 = LocalDate.parse("19/02/1890", df);
        date2 = LocalDate.now();
        System.out.println("Kỷ niệm "+ChronoUnit.YEARS.between(date1, date2)+" năm ngày sinh nhật Bác Hồ");
    }
}
