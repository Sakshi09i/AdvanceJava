// Static blocks are used to initialize static variables. 
// It is executed before the main method at the time of class loading.
    
class StaticBlock {
    static {
        System.out.println("Static block executed before main");
    }

    public static void main(String[] args) {
        System.out.println("Main method executed");
    }
}

