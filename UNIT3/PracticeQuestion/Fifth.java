// Given a list of numbers, filter only prime numbers
import java.util.ArrayList;
public class Fifth {

    public static boolean isPrime(int n){
        for(int i =2;i<= Math.sqrt(n);i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(9);
        numbers.add(11);

        numbers.stream()
                .filter(n -> isPrime(n))
                .forEach(System.out::println);
    }
}
