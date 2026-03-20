

import java.util.*;

public class ForEachList {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Sanyam", "Yogita", "Riya");

        names.forEach(name -> {
            System.out.println(name);
        });
    }
}

