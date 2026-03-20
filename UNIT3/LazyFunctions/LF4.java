package LazyFunctions;
// Count distinct elements from the list
import java.util.*;
public class LF4 {
    public static void main(String args[]){
        List<Integer> list = List.of(10,20,20,30,30,40,40,50,51,52,53);
        long count = list.stream()
                         .distinct()
                         .count();
        System.out.println(count);
    }
}
