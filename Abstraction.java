abstract class JavaClass {
    abstract void javaFeatures();  // Abstract method
}

class Robust extends JavaClass {
    void javaFeatures() {
        System.out.println("JAVA is Robust");
    }
}

class Scalable extends JavaClass {
    void javaFeatures() {
        System.out.println("JAVA is Scalable");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        // Creating objects of subclasses
        JavaClass obj1 = new Robust();
        JavaClass obj2 = new Scalable();
        
        // Calling the javaFeatures method for each object
        obj1.javaFeatures();  // Output: JAVA is Robust
        obj2.javaFeatures();  // Output: JAVA is Scalable
    }
}
