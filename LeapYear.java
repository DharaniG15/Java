import java.util.Scanner;
class LeapYear{
    public static void main(String[] args) {
     Scanner a=new Scanner(System.in);
     System.out.println("Enter Year : ");
     int num=a.nextInt();
     if(num/4==0 ) {
        if(num/100 !=0){
            if(num/400==0){
                System.out.println("Leap Year");
            }
        }
     }
     else{
        System.out.println("Not a leap year");
     }
    }
}