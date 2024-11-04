class PalindromeEquals{
    public static boolean checkingUsingEqualto(String str){
        String reversedString=new StringBuilder(str).reverse().toString();
        return str.intern()==reversedString.intern();
//the intern()method returns the reference from the stringpool , which means the string with the same content already exists.
//The == will not work without intern() method.
    }
        public static void main(String[] args) {
        String word="MOM";
        if(checkingUsingEqualto(word)){
            System.out.println(word + " is a Palindrome");
        }
        else{
            System.out.println(word + " is not a palindrome");
        }
    }
}