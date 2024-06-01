package Practice;

public class SlicingArray {
    //Max No.of slices an array can be made so that sorting and merging it will
    //generate a sorted array
    //Constraint is elements are from 0 -> n-1
    public static void main(String[] args) {

        int[] arr = new int[]{2,1,0,3,4,5};
        int slice =0;
        int max =arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }

            if(max == i){
                slice++;
            }
        }
        System.out.println(slice);
    }
}
