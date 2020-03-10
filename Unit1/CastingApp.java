import java.util.Scanner;
public class CastingApp
{
    public static void main(String[] argv){
        System.out.println("Some random numbers");
        Scanner input = new Scanner(System.in);
        int one = Casting.oneOrZero();
        int hundred = Casting.zeroTo99();
        System.out.println("(Zero to n integer) What is n?");
        int n = input.nextInt();
        int zni = Casting.zeroToN(n);
        System.out.println("(Zero to n double) What is n?");
        double d = input.nextDouble();
        double znd = Casting.zeroToN(d);
        System.out.println("(Min to Max int) What is min? ");
        int min = input.nextInt();
        System.out.println("(Min to Max int) What is max? ");
        int max = input.nextInt();
        int r1 = Casting.minToMax(min, max);
        System.out.println("(Min to Max double) What is min? ");
        double mind = input.nextDouble();
        System.out.println("(Min to Max double) What is max? ");
        double maxd = input.nextDouble();
        double r2 = Casting.minToMax(mind, maxd);
        System.out.format("oneOrZero: %d\nzeroTo99: %d\nzeroToN: %d\nzeroToN: %f \nminToMax (int): %d\nminToMax (double): %f",
                            one, hundred, zni, znd,r1, r2 );
    }
}
