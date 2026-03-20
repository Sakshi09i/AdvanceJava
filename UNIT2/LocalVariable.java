public class LocalVariable {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a);

        var b = 20;              // compiler infers type int
        System.out.println(b);

        var c = "Hello Java";    // compiler infers type String
        System.out.println(c);
    }

}
