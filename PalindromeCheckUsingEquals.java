

public class PalindromeCheckUsingEquals {
public static boolean equalsCheck(int number){
    String num=Integer.toString(number);
    String ReversedNum=new StringBuilder(num).reverse().toString();
    return num.equals(ReversedNum); 
}
public static void main(String[] args) {
    int O_number=121;
    if(equalsCheck(O_number)){
        System.out.println(O_number + " is a Palindrome");
    }
    else{
        System.out.println(O_number + " is not a Palindrome");
    }
}
    
}