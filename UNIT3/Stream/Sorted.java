

import java.util.*;
import java.util.stream.*;

public class Sorted {
    public static void main(String[] args) {

        // Create a List of integers
        List<Integer> list = Arrays.asList(5, 2,9, 1, 7, 3);
        List<Integer> sortedList = list.stream()
                                       .sorted() 
                                       .toList();    

        System.out.println("Original List: " + list);
        System.out.println("Sorted List: " + sortedList);
    }
}



