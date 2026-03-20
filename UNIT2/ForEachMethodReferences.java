import java.util.Arrays;
import java.util.List;

public class ForEachMethodReferences {
        public static void printName(String name) {
        System.out.println(name);
    }

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Sanyam", "Yogita", "Riya");

        names.forEach(ForEachMethodReferences::printName);
    }

}
