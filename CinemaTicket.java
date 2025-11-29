import java.util.Scanner;
public class CinemaTicket
{
    public static void main(String[] args)
        {
        Scanner scan= new Scanner(System.in);
        double child=150;
        double adult=250;
        double senior=200;
        double price=0;
        System.out.println("----------Pricing and Discount Rules----------");
        System.out.println("* Based Price By Age: ");
        System.out.println("    - Child: Rs.150    ");
        System.out.println("    - Adult: Rs.250    ");
        System.out.println("    - Senior: Rs.200    ");
        System.out.println("* Surcharge By Movie Language: ");
        System.out.println("    - Hindi Movie: + Rs.50 to the base price   ");
        System.out.println("    - English Movie: + Rs.100 to the base price   ");
        System.out.println("* Applicable Discounts (applied sequentially): ");
        System.out.println("    - Student Discount: 20% off if the customer has a valid ID.   ");
        System.out.println("    - Festive Discount: 15% off if it is a festival day.   ");
        System.out.println("-----------------------------------------------");
        System.out.println("\n");
        int age= scan.nextInt();
        System.out.println("Enter your age:"+age);
        scan.nextLine();
        String language= scan.nextLine();
        System.out.println("Enter your language preference (Hindi/English):"+language);
        String student= scan.nextLine();
        System.out.println("Are you a student? (Yes/No):"+student);
        String festive= scan.nextLine();
        System.out.println("Is it a festival day? (Yes/No):"+festive);
        if (age<=15) //For child
        {
            price=child; //Rs.150
            
            if (language.equals("Hindi"))
            {
                price +=50; //Rs.200
                
                if (student.equals("Yes"))
                {
                   price=price-(0.2*price); //20% discount as student; Rs.160
                   
                   if (festive.equals("Yes"))
                   {
                     price=price-(0.15*price); //15% discount on festival; Rs.136
                   }
                }
                else 
                {
                    if (festive.equals("Yes"))
                    {
                        price=price-(0.15*price); //Rs.170
                    }
                }
            }
            else //For English preference
            {
                price +=100; //Rs.250
                
                if (student.equals("Yes"))
                {
                  price=price-(0.2*price); //Rs.200
                    
                  if (festive.equals("Yes"))
                  {
                    price=price-(0.15*price); //Rs. 170
                  }
                }
                else
                {
                    if (festive.equals("Yes"))
                    {
                      price=price-(0.15*price); //Rs.212.5
                    }
                }
            }
        }
        else if (age>15 && age<=40) //For adult 
        {
            price=adult; //Rs.250
            
            if (language.equals("Hindi"))
            {
                price+=50; //Rs.300
                
                if (student.equals("Yes"))
                {
                   price=price-(0.2*price); //Rs.240
                   
                   if (festive.equals("Yes"))
                   {
                       price=price-(0.15*price); //Rs.204
                   }
                }
                else
                {
                   if (festive.equals("Yes"))
                   {
                       price=price-(0.15*price); //Rs.255
                   }
                }
            }
            else  //English
            {
            price+=100; //Rs.350
                
              if (student.equals("Yes"))
              {
                  price=price-(0.2*price); //Rs.280
                    
                  if (festive.equals("Yes"))
                  {
                      price=price-(0.15*price); //Rs.238
                  }
              }
              else
              {
                  if (festive.equals("Yes"))
                  {
                      price=price-(0.15*price); //Rs.297.5
                  }
              }
            }
        }
        
        else //Senior
        {
            price=senior; //Rs.200
            
            if (language.equals("Hindi"))
            {
                price+=50; //Rs.250
                
                if (student.equals("Yes"))
                {
                    price=price-(0.2*price); //Rs.200
                    
                    if (festive.equals("Yes"))
                    {
                        price=price-(0.15*price); //rs.170
                    }
                }
                else
                {
                    if (festive.equals("Yes"))
                    {
                        price=price-(0.15*price); //Rs.212.5
                    }
                }
            }
            else //English
            {
                price+=100; //Rs.300
                
                if (student.equals("Yes"))
                {
                    price=price-(0.2*price); //Rs.240
                    
                    if (festive.equals("Yes"))
                    {
                        price=price-(0.15*price); //Rs.204
                    }
                }
                else
                {
                    if (festive.equals("Yes"))
                    {
                        price=price-(0.15*price); //Rs.255
                    }
                }
            }
        }
        //Final Price
        System.out.println("Final Ticket Price = Rs. " + price);
    }
}


