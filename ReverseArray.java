import java.util.Arrays;
public class ReverseArray {
    public static void ReverseCall(int[] arr){ //it does not return anything
        int n=arr.length;
        for(int i=0;i<n/2;i++){ //the elements should be swapped
            int temp=arr[i]; //swapping
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }
    }
   public static void main(String[] args) {
    int arr[]={1,2,3,4,5};
  ReverseCall(arr);
   System.out.println(Arrays.toString(arr)); 
   }

}
