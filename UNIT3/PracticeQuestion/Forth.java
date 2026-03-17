// Given a list of strings, filter strings that contain the letter 'e'
import java.util.*;
public class Forth {
    public static void main(String args[]){
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");
        names.add("Eve");

        names.stream()
                .filter(name -> name.contains("e"))
                .forEach(System.out::println);

    }
}
