import java.util.Scanner;
class CountTheTotalNumberOfDigits{
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int count=0;
        System.out.println("Enter num : ");
        int num=a.nextInt();
        while(num!=0){
            num=num/10;
            count++;
        }
System.out.println(count);
    }
}