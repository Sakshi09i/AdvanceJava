

import java.util.*;
import java.util.stream.*;

public class StreamArray {
    public static void main(String[] args) {

        // Creating an array
        int[] arr = {1, 2, 3};
         // Creating IntStream from array
        IntStream stream = Arrays.stream(arr);

        // Printing elements
        stream.forEach(n -> System.out.println(n));
    }
}




