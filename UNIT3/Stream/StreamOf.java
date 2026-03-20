


import java.util.stream.*;

public class StreamOf {
    public static void main(String[] args) {

        // Creating Stream using Stream.of()
        Stream<String> s = Stream.of("A", "B", "C");

        // Printing elements
        s.forEach(x -> System.out.println(x));
    }
}

