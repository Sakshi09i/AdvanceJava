import java.util.HashMap;
import java.util.Map;

public class ForEachMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Sanyam");
        map.put(2, "Yogita");
        map.put(3, "Riya");

        map.forEach((key, value) -> {
            System.out.println("Key: " + key + ", Value: " + value);
        });
    }
}
