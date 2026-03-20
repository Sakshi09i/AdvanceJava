package LazyFunctions;
// Count how many numbers are greater than 50
import java.util.*;
public class LF3 {
    public static void main(String args[]){
        List<Integer> list = List.of(10,20,30,40,50,51,52,53);
        long count = list.stream()
                         .filter(num -> num > 50)
                         .count();
        System.out.println(count);
    }
}
