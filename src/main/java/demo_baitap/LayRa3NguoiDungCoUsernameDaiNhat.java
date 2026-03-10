package demo_baitap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LayRa3NguoiDungCoUsernameDaiNhat {
    public static void main(String[] args) {
        List<User> list = Arrays.asList(
                new User("cuongnt"),
                new User("binhnguyen"),
                new User("tien123"),
                new User("trungquan1995"),
                new User("manhduc2002"),
                new User("nguyenvancuong2005"),
                new User("nguyenhoabinh2020")
        );

        System.out.println("In ra 3 nguoi co username dai nhat: ");
        list.stream().sorted((u1,u2)->u2.getUsername().length()-u1.getUsername().length()).limit(3).forEach(System.out::println);
    }
}
