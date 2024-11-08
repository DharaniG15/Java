import java.util.Arrays;
public class RotateArray {
    public static void RotateArrayCall(int arr[]){
        int last=arr[arr.length-1];
        for(int i=arr.length-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=last;
    }
    public static void main(String[] args) {
        int arr[]={65,76,87,453,2345567,87654};
        RotateArrayCall(arr);
        System.out.println(Arrays.toString(arr));

    }
}
