import java.util.Scanner;

/**
 * Write a description of class PassedExam here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PassedExam
{
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        double marks= scan.nextDouble();
        System.out.println("Enter the marks of the student:");
        if (marks>=40){
            System.out.println("Passed");
        }
        else
        System.out.println("Failed");
        
    }
}