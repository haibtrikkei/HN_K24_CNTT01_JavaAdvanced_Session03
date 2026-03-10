package demo_stream_api;

import java.util.Arrays;
import java.util.List;

public class Demo_Map {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Nguyễn Văn Cường", "Trần Thanh Vân", "Phạm Khánh Huyền", "Trần Đức Nam", "Nguyễn Thanh Hải", "Nguyễn Hồng Đức");

        //Chuyển hết thành chữ viết hoa và hiển thị
//        names.parallelStream().map(String::toUpperCase).forEach(System.out::println);
        names.parallelStream().map(name -> name.toUpperCase()).forEach(e -> System.out.println(e));

        System.out.println("\nIn ra tên những người cùng họ Nguyễn: ");
        names.parallelStream().filter(name -> name.startsWith("Nguyễn")).forEach(System.out::println);
    }
}
