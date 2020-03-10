public class Casting
{
    public static int oneOrZero(){
        return (int)(Math.random() + 0.5);
    }
    
    public static int zeroTo99(){
        return (int)(Math.random() * 100);
    }
    
  /*  public static double zeroTo99(){
        return Math.random() * 100;
    }
    */
    public static int zeroToN(int n){
        return (int)(Math.random() * n);
    }
    
    public static double zeroToN(double n){
        return Math.random() * n;
    }
    
    public static int minToMax(int min, int max){
        double dec = Math.random();
        double raw = (dec * (max - min)) + min;
        return (int)raw;
    }
    
    public static double minToMax(double min, double max){
        double dec = Math.random();
        double raw = (dec * (max - min)) + min;
        return raw;
    }
}
