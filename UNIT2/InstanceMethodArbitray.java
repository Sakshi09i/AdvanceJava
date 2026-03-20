// Syntax: ClassName::instanceMethodName
@FunctionalInterface
interface MyInterface {
    void show(String msg);
}

public class InstanceMethodArbitray {
 public static void main(String[] args) {

        // Instance method reference of arbitrary object
        MyInterface ref = String::toUpperCase;

        // Method call
        ref.show("java");
    }
}
// (Here JVM supplies the object automatically.)



