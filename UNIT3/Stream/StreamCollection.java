

import java.util.*;
import java.util.stream.*;

public class StreamCollection {
    public static void main(String[] args) {

        // Creating an ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        // Creating Stream from ArrayList
        Stream<Integer> stream = list.stream();

        // Printing elements using Stream
        stream.forEach(n -> System.out.println(n));
    }
}




