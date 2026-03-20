package LazyFunctions;
import java.util.*;
// Count distinct values after skipping first 3
public class LF6 {
    public static void main(String args[]){
        List<Integer> list = List.of(10,20,20,30,30,40,40,50,51,52,53);
        long count = list.stream()
                         .skip(3)
                         .distinct()
                         .count();
        System.out.println(count);
    }
}
