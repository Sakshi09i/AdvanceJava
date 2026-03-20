

import java.util.*;
import java.util.stream.*;

public class MapFilter {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 15, 20, 25);

        List<Integer> result = list.stream()
                                   .filter(x -> x % 2 == 0)
                                   .map(x -> x * 2)
                                   .collect(Collectors.toList());

        System.out.println(result);
    }
}
