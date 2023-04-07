public class search2DMatrix {
    public static boolean searchMatrix(int[][] matrix, int target) {
        // System.out.println(matrix[0][0]);
        if (matrix.length <= 1) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (matrix[i][j] == target) {
                        return true;
                    }
                }
            }
            // return false;
        } else {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (matrix[i][j] == target) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // int matrix[][] = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
        int matrix[][] = { { 1} , {3} };
        int target = 0;
        System.out.println(matrix.length);
        System.out.println(searchMatrix(matrix, target));
    }
}