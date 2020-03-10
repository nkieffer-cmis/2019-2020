public class Examples
{
    public static void main(String[] argv){
        forAwhile(10);
    }
    
    public static void forever(){
        System.out.println("hello!");
        forever();
    }
    
    public static void forAwhile(int n){
        System.out.println("forAwhile: " + n);
        n--;
        if(n > 0){
            // recursive case
            forAwhile(n);
        }else{
            // base case
            System.out.println("Done!");
        }
    }
}
