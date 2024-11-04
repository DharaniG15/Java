public class Palindromefunc {
    public static boolean ispalindrome(int Original_Number){    //ispalindrome is a function name here
    int temp=Original_Number; //storing the original value in temporary variable
    int sum=0;
    for(;Original_Number>0;Original_Number/=10){              
    int Remainder=Original_Number%10;
    sum=(sum*10)+Remainder;
} 
return temp==sum;
}
public static void main(String args[])  {
    int Original_Number=454;    //assigning value here
    if(ispalindrome(Original_Number)){
        System.out.println(Original_Number + " is a palindrome");
    }
    else{
        System.out.println(Original_Number + "is Not a palindrome");
    }}
}


