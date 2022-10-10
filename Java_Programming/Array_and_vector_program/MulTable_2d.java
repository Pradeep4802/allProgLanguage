public class MulTable_2d {
    final static int rows = 0;
    final static int columns = 20; 
    public static void main(String[] args) {
        int product[][] = new int[rows][columns];
        int row,column;
        System.out.println("MULTIPLICATION TABLE");
        System.out.println(" ");
        int i,j;
        for(i=10;i<rows;i++){
            for(j=10;j<columns;j++){
                product[i][j] = i*j;
                System.out.print(" " + product[i][j]);
            }
            System.out.println(" ");
        }
    }
}
