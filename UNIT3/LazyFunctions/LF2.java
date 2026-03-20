// Skip last 2 elements using stream and print the remaining elements.

import java.util.*;
public class LF2 {
    public static void main(String args[]){
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
        // list.stream().skip(list.size()-2).forEach(n -> System.out.println(n));

        list.stream().limit(list.size() - 2).forEach(x -> System.out.print(x + " "));
    }
}
