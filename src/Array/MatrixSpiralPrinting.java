package Array;

public class MatrixSpiralPrinting {
    public static void main(String args[]) throws Exception {
        int a[][] = new int[][] {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}, {17,18,19,20}};
        print(a);
    }

    static void print(int n[][]){
        int colLen = n[0].length, rowLen = n.length;
        int elements = colLen*rowLen;

        // x axis is horizontal from first col to last
        // y axis is  vertical from first row to last
        // so array element will be accessed by a[
        int row = 0, col = 0;
        int maxRow = rowLen, maxCol = colLen;
        int minRow = 0, minCol = 0;
        boolean left = false, right = true, up = false, down = false;

        for(int i=0; i<elements; i++) {

            System.out.print(n[row][col] + " ");

            if(right) {
                col++;
            } else if(down) {
                row++;
            } else if(left) {
                col--;
            } else if(up) {
                row--;
            }

            if(col == maxCol) {
                right = false;
                down = true;
                row++;
                // col index can only be upto maxCol-1 so need to decrement
                col--;
            }

            if(row == maxRow) {
                down = false;
                left = true;
                col--;
                // row index can only be upto maxRow-1 so need to decrement
                row--;
            }

            if(left && col == minCol) {
                left = false;
                up = true;
            }

            if(up && row == minRow) {
                up = false;
                right = true;
                row++;
                col++;
                minRow++;
                minCol++;
                maxCol--;
                maxRow--;
            }
        }
    }

}
