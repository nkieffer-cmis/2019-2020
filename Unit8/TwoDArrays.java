import java.util.*;
public class TwoDArrays
{
    public static void main(String[] argv){
        int[][] matrix1 = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] matrix2 = new int[5][5];
        System.out.println(matrix2[0][1]);
        print(matrix1, true);
        print(matrix1, false);
        ArrayList<ArrayList<Integer>> almatrix = new ArrayList<ArrayList<Integer>>();
    }
    
    public static void print(int[][] matrix, boolean rowMajor){
        String out = "";
        for(int row = 0; row < matrix.length; row++){
            for(int col = 0; col < matrix[row].length; col++){
                if(rowMajor)
                    out += String.format("%d ", matrix[row][col]);
                    else
                    out += String.format("%d ", matrix[col][row]);
            
                }
            out += "\n";
        }
        System.out.println(out);
    }
    
    public static double average(int[][] matrix){
        return 0.0;
    }
    
    public static int[] minMax(int[][] matrix){
        return new int[2];
    }
    
    public static void replace(int[][] matrix, int threshold){
        
    }
    
    public static int greatest(int[][] matrix, boolean rowSum){
        return 0;
    }
    
    public static void shift(int[][] matrix, int amt){
        
    }
}
