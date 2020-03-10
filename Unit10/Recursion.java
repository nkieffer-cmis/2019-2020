public class Recursion
{
    public static void main(String[] argv){
        forawhile(10);
        System.out.println(multiply(5, 11));
        System.out.println(divide(15 , 5));
    }
    
    public static void forever(){
        System.out.println("forever!");
        forever();
    }
    
    public static void forawhile(int n){
        System.out.format("%d times!\n", n);
        if(n == 0){
            System.out.println("Done!");
        }else{
            forawhile(n-1);
        }
    }
    
    public static int multiply(int n, int x){
        if(x == 0){
            return 0;
        }else{
            return n + multiply(n, x-1);
        }
    }
    
    public static int divide(int n, int x){
        if(x > n){
            return 0;
        }else{
            return 1 + divide(n - x, x);
        }
    }
}
