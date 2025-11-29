import java.util.Scanner;

/**
 * Write a description of class PositiveNegative here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PositiveNegative
{
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        int num= scan.nextInt();
        System.out.println("Enter a number:");
        if (num>0)
        System.out.println(num+" is posotive.");
        else if (num<0)
        System.out.println(num+" is negative.");
        else
        System.out.println(num+" is zero.");
    }
}