import java.util.Scanner;
public class PrintingStrings
{
    public static void main(String[] argv){
        Scanner input = new Scanner(System.in);
        //declare and define with literal
        String firstName = input.nextLine();
        
        //declare and define with instance of String
        String lastName = new String("Kieffer");
        
        //declare
        String middleName;
        //define with literal or instance
        middleName = "Paul"; // OR new String("Paul");
        
        System.out.println(firstName);
        System.out.print(middleName + "\n");
        System.out.println(lastName);
        
        System.out.format("First Name: %s\nLast Name: %s\n", firstName, lastName);
        System.out.println("hi ther");
    }
}
