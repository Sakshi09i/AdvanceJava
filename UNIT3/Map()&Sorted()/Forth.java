// Convert a list of strings:"hello" → "Hello" (capitalize first letter).
// combined map and filter
import java.util.*;
import java.util.stream.*;
public class Forth {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("hello");
        List<String> result = strings.stream()
                                     .map(str -> str.substring(0, 1).toUpperCase() + str.substring(1))
                                     .collect(Collectors.toList());
        System.out.println(result);

    }
}
