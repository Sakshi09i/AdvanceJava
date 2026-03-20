// Convert a list of strings to uppercase using map()
import java.util.*;
import java.util.stream.*;
public class Second {
    public static void main(String args[]){
        List<String> names = Arrays.asList("sanyam", "rahul", "amit");
        List<String> result = names.stream()
                                   .map(name -> name.toUpperCase())
                                   .collect(Collectors.toList());

        System.out.println(result);
        
    }
}
