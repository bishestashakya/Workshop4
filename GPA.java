import java.util.Scanner;

/**
 * Write a description of class GPA here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GPA
{
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        double gpa= scan.nextDouble();
        System.out.println("Enter your GPA:");
        if (gpa>=0.0 && gpa<=4.0){
             System.out.println("Your GPA is valid");
        }
        else
        System.out.println("Your GPA is invalid");
        if (gpa>=3.6 && gpa<=4.0)
        System.out.println("Your GPA= A+");
        else if (gpa>=3.2 && gpa<3.6)
        System.out.println("Your GPA= A");
        else if (gpa>=2.8 && gpa<3.2)
        System.out.println("Your GPA= B+");
        else if (gpa>=2.4 && gpa<2.8)
        System.out.println("Your GPA= B");
        else if (gpa>=2.0 && gpa<2.4)
        System.out.println("Your GPA= C+");
        else if (gpa>=1.6 && gpa<2.0)
        System.out.println("Your GPA= C");
        else 
        System.out.println("You're failed.");
        }  
    }
