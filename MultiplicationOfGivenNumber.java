import java.util.Scanner;
public class MultiplicationOfGivenNumber {
public static void main(String[] args) {
   Scanner a=new Scanner(System.in);
   System.out.println("Enter num : ");
   int num=a.nextInt();
   for(int i=1;i<=10;i++){
    System.out.println(num + "*" + i+ "=" + num*i);
   }

}
    
}