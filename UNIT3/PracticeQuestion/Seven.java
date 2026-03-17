// Given a list of emails, filter only valis emails (contain "@" and ".")
import java.util.ArrayList;
public class Seven {
    public static void main(String args[]){
        ArrayList<String> emails = new ArrayList<>();
        emails.add("user@example.com");
        emails.add("invalid-email");
        emails.add("another@test.org");
        emails.add("yet-another@domain.net");

        emails.stream()
                .filter(email -> email.contains("@") && email.contains("."))
                .forEach(System.out::println);
    }   
}
