public class QuizV2
{
    public static void main(String[] argv){
        
    }
    /**
     * Write a method that returns the difference of the cubes of 2 numbers.
     * 
     * diffOfCubes(3, 6) -> -189
     * diffOfCubes(6, 4) -> 152
     * diffOfCubes(-6, 4) -> -280
     */
    public static int diffOfCubes(int a, int b){
        return (a * a * a) - (b * b * b);
    }
    
    /**
     * Write a method that returns the cube of the difference between 2 numbers.
     * 
     * cubeOfDiff(5, 4) -> 1.0
     * cubeOfDiff(5.3, 4.1) -> 1.7280000000000006
     * cubeOfDiff(7.3, 14.1) -> -314.43199999999996
     */
    public static double cubeOfDiff(double a, double b){
        double diff = a - b;
        return diff * diff * diff;
    }   
    
    /**
     * Write a method that returns the average of 3 numbers
     * 
     * avg(2, 3, 5) -> 3.3333333333333335
     * avg(-22, 3, 5) -> -4.666666666666667
     */
    public static double avg(int a, int b, int c){
        return ((double) a + b + c) / 3;
    }
    
    /**
     * Write a method that returns the average of the cubes of 3 numbers.
     * 
     * avgOfCubes(4.5, 6.1, 8.0) -> 276.702
     * avgOfCubes(0.0, 6.1, -0.8) -> 75.48966666666665 
     * 
     */
    public static double avgOfCubes(double a, double b, double c){
        double ca = a * a * a;
        double cb = b * b * b;
        double cc = c * c * c;
        return (ca + cb + cc) / 3;
    }
    
    /**
     * Write a method that returns the cube of the average of 3 numbers.
     * 
     * cubeOfAvg(1, 4, 6) -> 49.29629629629629
     * cubeOfAvg(1, 4, -3) -> 0.2962962962962963
     */
    public static double cubeOfAvg(int a, int b, int c){
        double avg = (a + b + c) / 3.0;
        return avg * avg * avg;
    }
    
    
    /**
     * Write a method that returns the sum of 3 numbers
     * 
     * sum(2.9, 2.1, 2.0) -> 6
     * sum(2, 2, 2) -> 6
     */
    public static int sum(double a, double b, double c){
        return (int)a + (int)b + (int)c;
    }
    
    
}
