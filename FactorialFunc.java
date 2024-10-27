class FactorialFunc {
    public static long factorial(int num) {
        long result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i; 
        }
        return result; 
    }

    public static void main(String[] args) {
        System.out.println(factorial(5)); 
        System.out.println(factorial(20)); 
        System.out.println(factorial(21)); 
        System.out.println(factorial(0)); 
    }
}
