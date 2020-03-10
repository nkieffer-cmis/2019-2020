import java.util.Scanner;
public class MathOpsApp
{
    public static void main(String[] argv){
        System.out.println("MathOps");
        System.out.println(Math.PI);
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        double b = in.nextDouble();
        double c = MathOps.add(a, b);
        System.out.println(c);
    }    
}
