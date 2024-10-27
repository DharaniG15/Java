import java.util.Scanner;
class PrimeNumber{
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("Enter Number : ");
        int num=a.nextInt();
        for(int i=2;i<num;i++){
            if(num%i==0){
                System.out.println("Not a Prime");
                break;
            }
            else{
                System.out.println("prime");
                break;
            }
        }
    }
}