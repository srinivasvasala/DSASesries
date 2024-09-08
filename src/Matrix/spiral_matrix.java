package Matrix;

public class spiral_matrix{
    public static void spiralMatrix(int m, int n, int[][] a){
        int top=0;int bottom=m-1;int left=0;int right=n-1;
        while(top<=bottom && left<=right){
            //step-1 printing left to right
            for(int i =top;i<=right;i++){
                System.out.print(a[top][i]+" ");
            }
            top++;
            //step-2 print top to bottom
            for(int i=top;i<=bottom;i++){
                System.out.print(a[i][right]+" ");
            }
            right--;
            //step-3 print bottom row right to left
            for(int i=right;i>=left;i--){
                System.out.print(a[bottom][i]+" ");
            }
            bottom--;
            //step-4 print left bottom to top
            if(left<=right) {
                for (int i = bottom; i >= top;i--) {
                    System.out.print(a[i][left]+" ");
                }
                left++;
            }

        }
    }

    public static void main(String[] args) {
        int[][] matrix={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}

        };
        spiralMatrix(matrix.length,matrix[0].length,matrix);
    }
}
