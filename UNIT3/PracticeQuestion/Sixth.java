// Given a list of integers, filter numbers whose sqaure is greater than 500
import java.util.ArrayList;
public class Sixth {
    public static void main(String args[]){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);
        numbers.add(30);

        numbers.stream()
                .filter(n -> n * n > 500)
                .forEach(System.out::println);
    }
}
