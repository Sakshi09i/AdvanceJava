// Given a integers, use map() to multiply each number by 2 and print the new list
// input: [1,2,3,4] -> Output: [2,4,6,8]
import java.util.*;
import java.util.stream.*;
public class First {
    public static void main(String args[]){
        // List<Integer> list = Arrays.asList(1,2,3,4);

        List<Integer> list = Arrays.asList(1,2,3,4);

        List<Integer> result = list.stream()
                            .map(x-> x*2)
                            .collect(Collectors.toList());

        System.out.println(result);
    }
}
