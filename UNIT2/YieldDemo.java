public class YieldDemo {
    public static void main(String args[]){
    int marks = 75;
    String grade = switch (marks / 10) {
        case 10, 9: {
            System.out.println("Excellent performance");
            yield "A";
        }
        case 8: {
            yield "B";
        }
        case 7: {
            yield "C";
        }
        default: {
            yield "Fail";
        }
    };
    System.out.println("Grade: " + grade);


    }
}
