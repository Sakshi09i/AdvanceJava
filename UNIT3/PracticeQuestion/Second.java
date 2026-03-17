// Given a list of names, filter names ending with "n"

import java.util.ArrayList;

public class Second {
    public static void main(String args[]){
        ArrayList<String> names = new ArrayList<>();
        names.add("Arjun");
        names.add("Rahul");
        names.add("Aman");
        names.add("sakshi");
        names.add("Rohan");

        names.stream()
                .filter(name -> name.endsWith("n"))
                .forEach(System.out::println);
    }
}
