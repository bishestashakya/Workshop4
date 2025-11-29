import java.util.Scanner;

/**
 * Write a description of class Divisible here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Divisible
{
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        int num= scan.nextInt();
        System.out.println("Enter a number:");
        if (num%3==0){
            if (num%5==0){
                System.out.println(num+" is divisible by 3 and 5.");
            }
            else
            System.out.println(num+" is divisible by 3 only.");
        }
        else if (num%5==0){
            System.out.println(num+" is divisible by 5 but not 3.");
        }
        else
        System.out.println(num+" is not divisible by both.");
    }
}