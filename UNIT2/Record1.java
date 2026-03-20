
record Student(int id, String name){
    
}


public class Record1 {
    public static void main(String[] args) {

        Student s = new Student(101, "Amit");

        System.out.println(s.id());
        System.out.println(s.name());
        System.out.println(s);  // auto tostring( )
    }

}
