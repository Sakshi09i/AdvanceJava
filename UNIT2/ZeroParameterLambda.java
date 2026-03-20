// 1. Lambda Expression with Zero Parameters

@FunctionalInterface
interface ZeroParameter {
    void display();
}


public class ZeroParameterLambda {
    public static void main(String[] args) {
        ZeroParameter zp = () -> 
            System.out.println("Zero parameter lambda expression");
        zp.display();
    }

}
