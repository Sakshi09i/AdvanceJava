// Given a list of Employees(salary), filter employess with salary > 50000

import java.util.ArrayList;
public class Third {
    public static void main(String args[]){
        ArrayList<Integer> emp = new ArrayList<>();
        emp.add(45000);
        emp.add(55000);
        emp.add(60000);
        emp.add(40000);
        emp.add(70000);

        emp.stream()
                .filter(salary -> salary > 50000)
                .forEach(System.out::println);
    }
}
