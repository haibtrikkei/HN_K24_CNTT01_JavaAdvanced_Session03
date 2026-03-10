package demo_optional;

import java.util.NoSuchElementException;
import java.util.Optional;

public class Demo_Optional {
    public static void main(String[] args) {
        Product p = null;

//        Optional<Product> opt = Optional.of(p); // Nếu p null thì ném ra ngoại lệ
        Optional<Product> opt = Optional.ofNullable(p);  //Nếu p null thì không ném ra ngoại lệ
        opt.ifPresent(System.out::println);


    }
}
