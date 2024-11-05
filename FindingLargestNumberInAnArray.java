public class FindingLargestNumberInAnArray {

    public static int CallArray(int[] array){
        int max=array[0]; //initially the first element is set to the largest element
        for(int i=1;i<array.length;i++){
            if(max<array[i]){
                max=array[i];
            }
            
        }
        return max;
    }
    public static void main(String[] args) {
        int array[]={10,20,34,56};
        int max=CallArray(array);
        System.out.println("The largest Element is : " + max);
    }
}