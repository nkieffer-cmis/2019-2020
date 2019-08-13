import java.util.Scanner;
public class PrintingStrings
{
    public static void main(String[] argv){
        Scanner inputScanner = new Scanner(System.in);
        System.out.print(">>> ");
        String input = inputScanner.nextLine();
        System.out.println(input);
    }
}
