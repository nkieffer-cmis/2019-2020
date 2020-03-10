
/**
 * Write a description of class Scratch here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Scratch
{
    public static void main(String[] argv){
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        
        for(int i = 1; i < arr.length - 1; i++){
            arr[i + 1] = arr[i - 1];
            arr[i] = arr[i + 1];
        }
        
        for(int i: arr)
            System.out.print(i + " ");
    }
}
