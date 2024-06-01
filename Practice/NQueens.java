package Practice;

public class NQueens {

    public static void main(String[] args) {

        int[][] arr = new int[4][4];
        for (int i =0; i< arr.length;i++){
            for(int j = 0;j<arr[i].length;j++){
                arr[i][j] = 0;
            }
        }

        for (int i =0; i< arr.length;i++){
            for(int j = 0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        placeQueens(0,arr,arr.length);



        for (int i =0; i< arr.length;i++){
            for(int j = 0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static void placeQueens(int col, int[][] arr, int length) {
        for(int i=0;i< arr.length-1;i++){
                if(isSafe(arr, i, col)){
                    arr[i][col] = 1;
                    placeQueens(col+1, arr, length);
                    arr[i][col] = 0;
                }
            }
        }

    private static boolean isSafe(int[][] arr, int row, int col) {
        int duprow = row;
        int dupcol = col;

        //upper diagonal
        while(row >=0 && col>=0){
            if(arr[row][col] == 1){
                return false;
            }
            row--;
            col--;
        }

        row = duprow;
        col = dupcol;

        //left
        while(col>=0){
            if(arr[row][col] == 1) {
                return false;
            }
            col--;
        }

        row = duprow;
        col = dupcol;

        //lower diagonal left
        while (row<arr.length && col>=0){
            if(arr[row][col] == 1){
                return false;
            }
            row++;
            col--;
        }
        return true;
    }
}

