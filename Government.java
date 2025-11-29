import java.util.Scanner;

/**
 * Write a description of class Government here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Government
{
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        double income= scan.nextDouble();
        System.out.println("Enter you annual income:");
        if (income<=500000)
        {
            double tax= (0.01*income);
            System.out.println("Your payable tax=" +tax);
        }
        else if (income>500000 && income<=700000)
        {
            double tax= 5000+(0.1*(income-500000));
            System.out.println("Your payable tax=" +tax);
        }
        else if (income>700000 && income<=1000000)
        {
            double tax= 15000+ (0.2*(income-700000));
            System.out.println("Your payable tax=" +tax);
        }
        else if (income>1000000 && income<=2000000)
        {
            double tax= 35000+ (0.3*(income-1000000));
            System.out.println("Your payable tax=" +tax);
        }
        else if (income>2000000 && income<=5000000)
        {
            double tax= 335000+ (0.36*(income-2000000));
            System.out.println("Your payable tax=" +tax);
        }
        else if (income>5000000)
        {
            double tax= 1135000+ (0.39*(income-5000000));
            System.out.println("Your payable tax=" +tax);
        }
        }
    }
