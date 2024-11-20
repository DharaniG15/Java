class Addition{
    int add(int odd,int even){
        return odd+even;
    }
    int add(int odd,int even,int prime){
        return odd+even+prime;
    }
}
public class PolymorphismMethodOverLoading{
    public static void main(String[] args){
    Addition add1=new Addition();
    System.out.println(add1.add(17,4));
    System.out.println(add1.add(19,10,3));
    }
}