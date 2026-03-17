record employee(int id, String name, int salary){}
public class Employe {
    public static void main(String args[]){
        employee e  = new employee(101, "Sakshi", 9800000);
        System.out.println(e.id());
        System.out.println(e.name());
        System.out.println(e.salary());
        System.out.println(e);
    }
}
