import java.util.Scanner;

/**
 * Write a description of class Switch here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Switch
{
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        double mp= 1000;
        String choice= scan.nextLine();
        System.out.println("Enter your choice:");
        switch (choice){
            case "A": double sp= mp-(mp*0.6);
            System.out.println("Your selling price=" +sp);
            break;
            case "B": sp= mp-(mp*0.4);
            System.out.println("Your selling price=" +sp);
            break;
            case "D": sp= mp-(mp*0.2);
            System.out.println("Your selling price=" +sp);
            break;
            default: System.out.println("Invalid Choice");
        }
        }
    
}
