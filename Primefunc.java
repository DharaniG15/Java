class Primefunc{
    
public static boolean isprime(int num){
    if(num<=0) return false;
    for(int i=2;i<=Math.sqrt(num);i++)
    {
     if(num%i==0) return false;
    }
    return true;
 }
 public static void main(String[] args) {
    System.out.println(isprime(-1));
    System.out.println(isprime(7));
    System.out.println(isprime(129));
 }
}