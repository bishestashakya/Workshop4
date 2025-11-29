import java.util.Scanner;

/**
 * Write a description of class Discount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Discount
{
    public static void main(String[] args){
        double mp= 1000.0;
        Scanner scan= new Scanner(System.in);
        char choice= scan.next().charAt(0);
        System.out.println("Enter your category:");
        if (choice=='A'){
            double sp= mp-(mp*0.6);
            System.out.println("Your selling price=" +sp);
        }
        else if (choice=='B'){
            double sp= mp-(mp*0.4);
            System.out.println("Your selling price=" +sp);
        }
        else if (choice=='C'){
            double sp= mp-(mp*0.2);
            System.out.println("Your selling price=" +sp);
        }
        else if (choice=='D'){
            double sp= mp-(mp*0.1);
            System.out.println("Your selling price=" +sp);
        }
        else
        System.out.println("Invalid Character");
        }
    }
