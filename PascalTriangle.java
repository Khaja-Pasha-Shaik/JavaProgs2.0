public class PascalTriangle {

    public static void main(String[] args) {
        int n = 10;
        int[][] triangle = new int[n][n];

        for (int row = 0; row <n; row++){
            for(int k=0; k<n-row-1;k++){
                System.out.print(" ");
            }
            for (int col=0; col<=row;col++){
                if(col == 0 || col == row){
                    triangle[row][col] = 1;
                } else{
                    triangle[row][col] = triangle[row-1][col-1] + triangle[row-1][col];
                }
                System.out.print(triangle[row][col]+" ");
            }
            System.out.println();
        }
    }
}
