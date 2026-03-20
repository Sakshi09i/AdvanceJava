
import java.util.*;
import java.util.stream.Stream;

public class Filter2 {
    public static void main(String[] args) {
        Stream<Integer> st = Stream.of(1, 2, 3, 4, 5, 6);
        st.filter(n -> n % 2 == 0)
           .forEach(System.out::println);
    }
}

