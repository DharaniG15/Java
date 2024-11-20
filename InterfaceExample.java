interface Concept {                  // Interface declaration
    void write();                    // Abstract method 
}

class Concept1 implements Concept {           // Class implements the interface
    @Override
    public void write() { 
        System.out.println("I am Writing");
    }
}

public class InterfaceExample { 
    public static void main(String[] args) {
        Concept con = new Concept1(); 
        con.write();                   // Calling the write() method
    }
}
