import java.util.ArrayList;
import java.util.List;
class ArrayListFunc{
    public static int ArrList(List<Integer> num){
        int total=0;
        for(int i=0;i<num.size();i++){
            total+=num.get(i);
        }return total;
      

    }
    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>();
        num.add(50);
        num.add(40);
        System.out.println(ArrList(num));
       
}}