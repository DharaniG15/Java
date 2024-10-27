class GradingFunction{
   
    
    public static String getgrade(int score){
        if(score>=80 && score<=100) return "A";
        if(score>=60 && score<80) return "B";
        if(score>=40 && score<60) return "C";
        if(score>=20 && score<40) return "D";
        else return "F";

    }
    
    public static void main(String[] args) {
        System.out.println(getgrade(85));
        System.out.println(getgrade(75));
        System.out.println(getgrade(101));
        }
}