// Given a list of strings, use map() to find the length of each string.
// Example: ["java", "stream"] → [4, 6]

import java.util.*;
import java.util.stream.*;
public class Third {
    public static void main(String args[]){
            List<String> words = Arrays.asList("java", "stream");
            List<Integer> lengths = words.stream()
                                        .map(String::length)
                                        .collect(Collectors.toList());
    
            System.out.println(lengths);
    }
}
