class PalindromeNumCheck{
    public static boolean NumberCheck(int OriginalNumber)
    {
        int ReversedNumber=0;
        while(OriginalNumber>0){
            int LastDigit=OriginalNumber%10;
           ReversedNumber=(ReversedNumber * LastDigit)*10;
           OriginalNumber/=10;
        }    return OriginalNumber==ReversedNumber;
    }
        public static void main(String[] args){
            int num=121;
            if(NumberCheck(num)){
                System.out.println(num + " is a Palindrome");
            }
            else{
                System.out.println(num + " is not a Palindrome");
            }
        

    }
}