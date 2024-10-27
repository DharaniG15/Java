import java.util.Scanner;
class GradingSystem{
    public static void main(String[] args) {
       Scanner a=new Scanner(System.in);
       System.out.println("Enter the Mark : ");
       int num=a.nextInt(); 
       if(num >=1 && num<=34){
        System.out.println("Fail");
       }
       else if(num>=35 && num<=54){
        System.out.println("Div 2");
       }
       else if(num>=55 && num<=74){
        System.out.println("Div 1");
       }
       else if(num>=75 && num<=100){
        System.out.println("Honours");
       }
       else{
        System.out.println("ENTER VALID MARK");
       }
    }
}