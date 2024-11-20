class Dharani {
    String Name;
    int MARK;

    void display() {                       //method
        System.out.println("MARK of " + Name + " is " + MARK);
    }
}

public class ClassAndObject {
    public static void main(String[] args) {
        Dharani dharu = new Dharani();           //object
        dharu.Name = "Dharani_G";
        dharu.MARK = 90;
        dharu.display();
    }
}
