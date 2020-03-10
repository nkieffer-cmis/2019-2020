public class Quiz
{
    public static void main(String[] argv){

    }
    
    public static int sumOfSquares(int a, int b){
        return (a * a) + (b * b);
    }
    
    public static double squareOfSum(double a, double b){
        return (a + b) * (a + b);
    }
    
    public static double avg(int a, int b, int c){
        return ((double) a + b + c) / 3;
    }
    
    public static double avgOfCubes(double a, double b, double c){
        double ca = a * a * a;
        double cb = b * b * b;
        double cc = c * c * c;
        return (ca + cb + cc) / 3;
    }
    
    public static double cubeOfAvg(int a, int b, int c){
        double avg = (a + b + c) / 3.0;
        return avg * avg * avg;
    }
    
    public static int sum(double a, double b, double c){
        return (int)(a + b + c);
    }
    
    
}
