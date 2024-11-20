class Program{
    void run(){
        System.out.println("Program is running");
    }
}
class Program2 extends Program{
    void run(){
        System.out.println("Program2 is running");         //overrides
    }
}

public class PolymorphismMethodOverriding {
    public static void main(String[] args) {
        Program2 prgm=new Program2();
        prgm.run();
    }
    
}
