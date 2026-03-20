package LazyFunctions;
// print only the first 5 even numbers from the list
import java.util.*;

public class LF1 {
    public static void main(String args[]){
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10,11,12);
        list.stream()
            .filter(num -> num % 2 == 0)
            .limit(5)
            .forEach(System.out::println);
    }
}
