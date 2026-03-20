package LazyFunctions;
// Skip last 2 elements using stream
import java.util.*;
public class LF2 {
    public static void main(String args[]){
        List<Integer> list = List.of(10,20,30,40,50,60,70,80);
        list.stream()
            .skip(list.size() - 2)
            .forEach(System.out::println);
    }
}
