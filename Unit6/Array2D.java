
/**
 * Write a description of class Array2D here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Array2D
{
    public static void main(String[] argv){
        int[][] a2 = {{1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15}};
        int[][] a3 = new int[5][5];
        int[][] a4 = random2d(4, 6);
        print2d(a4, true);
    }

    public static void print2d(int[][] array, boolean rowMajor){
        if(rowMajor){
            for(int row = 0; row < array.length; row++){
                for(int col = 0; col < array[row].length; col++){
                    System.out.print(array[row][col]+" ");
                }
                System.out.println();
            }
        }else{
            for(int col = 0; col < array[0].length; col++){
                for(int row = 0; row < array.length; row++){
                    System.out.print(array[row][col]+" ");
                }
                System.out.println();
            }
        }
    }
    public static int[][] random2d(int rows, int cols){
        int[][] array = new int[rows][cols];
        for(int row = 0; row < rows; row++){
            for(int col = 0; col < cols; col++){
                array[row][col] = (int)(Math.random() * 200) - 100;
            }
        }
        return array;
    }
    
    public static int greatestSum(int[][] array, boolean fromRow){
        int sum = 0;
        if(fromRow){
            for(int[] row: array){
                int thisRow = 0;
                for(int col: row){
                    thisRow+=col;
                }
                if(thisRow > sum){
                    sum = thisRow;
                }
            }
        }else{
            for(int col = 0; col < array[0].length; col++){
                int thisCol = 0;
                for(int row = 0; row < array.length; row++){
                    thisCol += array[row][col];
                }
                if(thisCol > sum){
                    sum = thisCol;
                }
            }
        }
        return sum;
    }
}
