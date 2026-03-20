

import java.util.*;

public class Filter3{
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(25);

        list.stream()
            .filter(n -> n > 15)
            .forEach(System.out::println);
    }
}

