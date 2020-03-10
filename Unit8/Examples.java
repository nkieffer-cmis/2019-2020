public class Examples
{
    public static void main(String[] argv){
        int[] array = new int[5];
        int[][] matrix1 = new int[3][3];
        int[][] matrix2 = {{1,2,3, 5}, {4,5,6, 4}, {7,8,9, 2}};
        print1(matrix2);
       colMajor(matrix2);
    }
    
    public static void print1(int[][] matrix){
        String out = "";
        
        for(int row = 0; row < matrix.length; row++){
            for(int col = 0; col < matrix[row].length; col++){
                out += matrix[row][col] + " ";
            }
            out += "\n";
        }
        System.out.println(out);
        System.out.println("------------------------");
    }
    
    public static int[] flatten(int[][] matrix){
        return new int[0];
    }
    
    public static int[][] stackUp(int[] array, int width)
    
    
    
    
    
    
    
    
    
    
    
    
    public static void colMajor(int[][] matrix){
        String out = "";
        for(int col = 0; col < matrix[1].length; col++){
            for(int row = 0; row < matrix.length; row++){
                out += matrix[row][col] + " ";
            }
            out += "\n";
        }
        System.out.println(out);
    }
    public static void print2(int[][] matrix){
        String out = "";
        for(int[] row: matrix){
            for(int col: row){
                out += col + " ";
            }
            out += "\n";
        }
        System.out.println(out);    
        
    }
}
