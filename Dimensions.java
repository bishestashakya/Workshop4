import java.util.Scanner;

/**
 * Write a description of class Dimensions here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dimensions
{
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        String choice= scan.nextLine();
        System.out.println("Enter your paper size:");
        switch (choice){
            case "A0": System.out.println("Your paper size= 841 x 1189mm (33.1 x 46.8 inches)");
            break;
            case "A1": System.out.println("Your paper size= 594 x 841mm (23.4 x 33.1 inches)");
            break;
            case "A2": System.out.println("Your paper size=420 x 594mm (16.5 x 23.4 inches)");
            break;
            case "A3": System.out.println("Your paper size= 297 x 420mm (11.7 x 16.5 inches)");
            break;
            case "A4": System.out.println("Your paper size= 210 x 297mm (8.3 x 11.7 inches)");
            break;
            case "A5": System.out.println("Your paper size= 148 x 210mm (5.8 x 8.3 inches)");
            break;
        
        }
    }
}
