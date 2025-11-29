import java.util.Scanner;

/**
 * Write a description of class Eligibility here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Eligibility
{
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        double gpa= scan.nextDouble();
        System.out.println("Enter your GPA:");
        double attendance= scan.nextDouble();
        System.out.println("Enter your attendance:");
        int attitude= scan.nextInt();
        System.out.println("Enter your attitude score:");
        if (gpa>=3.2)
        {
            if (attendance>80)
            {
                if (attitude>5)
                System.out.println("You are eligible for scholarship.");
                else
                System.out.println("You aren't eligible for scholarship due to your attitude.");
            }
            else 
            System.out.println("You aren't eligible for scholarship due to your attendance.");
        }
        else 
        System.out.println("You aren't eligible for scholarship.");
    }
}