public class ArrayMinMax {
    public static int[] MinMaXCall(int arr[]){
        int min=arr[0]; 
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }

        }
        return new int[]{min,max};
    }
    public static void main(String[] args) {
        int[] arr={12,56,23,45};
        int[] result=MinMaXCall(arr); //function is called and storing the 2 values in an array named result
        System.out.println( "Min Element Is : " + result[0]);
        System.out.println("Max Element Is : " + result[1]);
    }}
