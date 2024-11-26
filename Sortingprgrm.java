import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
public class Sortingprgrm {
    public static void main(String[] args) {
        
    
    ArrayList <Integer> integers=new ArrayList<>();
    System.out.println("Enter 6 numbers : ");
    Scanner input=new Scanner(System.in);
    for (int i=0;i<6;i++){
        int temp=input.nextInt();
        if(!integers.contains(temp)){
            integers.add(temp);
        }
     
    }
    Collections.sort(integers);
        System.out.println(integers);
    
}
}