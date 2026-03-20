package LazyFunctions;
import java.util.*;
//  skip first 2 numbers , then take next 3 and print
public class LF5 {
    public static void main(String args[]){
        List<Integer> list = List.of(10,20,30,40,50,60,70,80);
        list.stream()
            .skip(2)
            .limit(3)
            .forEach(System.out::println);
    }
}