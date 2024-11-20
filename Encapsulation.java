class Details {
    private int mark;
    private String name;

    public String getName() {                       // Getter for name
        return name;
    }

                              
    public void setName(String name) {             // Setter for name
        this.name = name;
    }

                                
    public int getMark() {                          // Getter for mark
        return mark;
    }

  
    public void setMark(int mark) {                    // Setter for mark 
        this.mark = mark;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
       
        Details info = new Details();

       
        info.setName("Dharani");                        // Set name and mark using setter methods
        info.setMark(90);

        System.out.println("Mark of " + info.getName() + " is " + info.getMark());         
        // Get name and mark using getter methods 
    }
}
