class Dharani{
    void favourite(){
        System.out.println("Favourite subject of Dharani is OOPS");
    }
}
class Sandhiya extends Dharani{
    void fav(){
        System.out.println("Favourite subject of Sandhiya is ALGORITHMS");
    }
}    


public class InheritancePrgm {
    public static void main(String[] args) {
        Sandhiya sub=new Sandhiya();
        sub.fav();
        sub.favourite();
        

    }
    
}
