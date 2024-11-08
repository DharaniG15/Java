public class OccurrenceCount {

    // Binary search to find the first occurrence of X using a for loop
    public static int binarySearchFirst(int[] arr, int n, int x) {
        int low = 0, high = n - 1;
        for (; low <= high;) {
            int mid = (low + high) / 2;
            if (arr[mid] == x) {
                
                high = mid - 1;
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
       
        return (low < n && arr[low] == x) ? low : -1;
    }

    
    public static int binarySearchLast(int[] arr, int n, int x) {
        int low = 0, high = n - 1;
        for (; low <= high;) {
            int mid = (low + high) / 2;
            if (arr[mid] == x) {
                
                low = mid + 1;
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        
        return (high >= 0 && arr[high] == x) ? high : -1;
    }

   
    public static int countOccurrences(int[] arr, int x) {
        int n = arr.length;
        
       
        int first = binarySearchFirst(arr, n, x);
        int last = binarySearchLast(arr, n, x);
        
        
        if (first == -1 || last == -1) {
            return 0;
        }
   
        return last - first + 1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 4, 5};
        int x = 2;
        System.out.println(countOccurrences(arr, x));  // Output: 3
    }
}
