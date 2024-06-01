package searching;

public class BinarySearch {

    public static void main(String[] args) {

        //For binary search to work, array should be sorted
        //Always calculate mid and checks if the needed element is greater
        //Search in the right side sub-array, hence make l=mid+1
        //or else search in left side array, hence make r=mid-1

        int[] arr = new int[]{4,8,12,14,17,25,29,31,36,42,47,53,55};
        int key = 4;
        int res = binSearch(arr,key);
        if(res != -1)
            System.out.println("Found");
        else
            System.out.println("Not Found");
    }

    private static int binSearch(int[] arr, int key) {
        int l =0;
        int r= arr.length-1;
        while (l<=r){
            int mid = (l+r)/2;
            if(arr[mid] == key){
                return mid;
            }
            if(arr[mid] < key){
                l=mid+1;
            }
            else {
                r = mid-1;
            }
        }
        return -1;
    }
}
