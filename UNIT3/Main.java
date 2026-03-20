import java.util.*;
import java.util.stream.*;


public class Main{
    public static void main(String args[]){
        List<Integer> list = List.of(10,20,20,30,30,40,40,50,51,52,53);
        long result = list.stream()
                                    .distinct()
                                    .limit(5)
                                    .skip(3)
                                    .count();
        System.out.println(result);
    }
}