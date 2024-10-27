import java.util.Scanner;
class CalculateSumOfAllNumbers{
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("enter num : ");
        int num=0;
        int sum=a.nextInt();
        for(int i=1;i<=sum;i++){
            num=num+i;

        }
        System.out.println(num);
    }
   
}