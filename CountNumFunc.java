class CountNumFunc{
    public static int countLength(int num){
        return String.valueOf(Math.abs(num)).length();
    }
    public static void main(String[] args) {
        System.out.println(countLength(-6789));
    }
}