
record Student(int id, String name, double marks) {}


public class Record2 {
    public static void main(String[] args) {
        Student s = new Student(101, "Sonam", 89.5);

        System.out.println(s.id());
        System.out.println(s.name());
        System.out.println(s.marks());
        System.out.println(s);     // auto toString()
    }

}
