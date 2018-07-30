/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ice_cream;

/**
 *
 * @author radur
 */
import java.io.*;
public class Ice_cream {

    public static void main(String[] args) throws IOException
    {
        Menu m=new Menu();
        m.menu1();
        Choice c=new Choice();
        int ans1=c.choice1();
        Bill b=new Bill();
        b.display(ans1);
    }
    
}

class Menu
{
    public void menu1()
    {
        System.out.println("!!!!!!!"+"WELCOME TO FREEZERIA ICE-CREAM PARLOUR"+"!!!!!!!");
        System.out.println("----------------------------------------------------------");
        System.out.println("Kindly make your choice from the given menu");
        System.out.println("----------------------------------------------------------");
        System.out.println("\nMENU\n");
        System.out.println("        ICE-CREAMS      \n");
        System.out.println("Sr no."+"       "+"Flavour"+"      "+"Price/Scoop(Rs.)");
        System.out.println("  1:  "+"       "+"Chocolate"+"     "+"     50");
        System.out.println("  2:  "+"       "+"Vanilla"+"     "+"       40");
        System.out.println("  3:  "+"       "+"Strawberry"+"     "+"    60");
        System.out.println("  4:  "+"       "+"Butter Scotch"+"     "+" 70");
        System.out.println("  5:  "+"       "+"Pista"+"     "+"65");
        System.out.println("  6:  "+"       "+"Tender Coconut"+"     "+"75");
        System.out.println("  7:  "+"       "+"Mango"+"     "+"55");
        System.out.println("  8:  "+"       "+"Black grapes"+"     "+"  80");
        System.out.println("  9:  "+"       "+"Watermelon"+"     "+"    85");
        System.out.println("  10:  "+"       "+"Sitaphal"+"     "+"     75\n\n");
        
        System.out.println("        BEVERAGES       ");
        System.out.println("Sr no."+"       "+"Flavour"+"       "+"Price/Serve(Rs.)");
        System.out.println("  1:  "+"       "+"Cold coffee"+"     "+"  50");
        System.out.println("  2:  "+"       "+"Hot Chocolate"+"     "+"40");
        System.out.println("  3:  "+"       "+"Mocha"+"     "+"        60");
        System.out.println("  4:  "+"       "+"Latte"+"     "+"        70");
        System.out.println("  5:  "+"       "+"Frappe"+"     "+"       65");
        System.out.println("  6:  "+"       "+"Espresso"+"     "+"     75");
        System.out.println("  7:  "+"       "+"Black coffee"+"     "+" 55");
        System.out.println("  8:  "+"       "+"Chai Tea"+"     "+"     80");
        System.out.println("  9:  "+"       "+"Lemon Tea"+"     "+"    85");
        System.out.println("  10:  "+"       "+"Fruit Juice"+"     "+" 75");
        
        
        
    }
}

class Choice
{
    public int choice1()throws IOException
    {
        int ans=0;
        int ans1=0;
        int n=0;
        int n1=0,z=0;
        String s;
        String s1;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        do
        {
            System.out.println("Enter 1 for ice-cream and 2 for beverages: ");
            z=Integer.parseInt(br.readLine());
            if(z==1)
            {
                System.out.println("Please enter your choice: ");
                int ch=Integer.parseInt(br.readLine());
                switch(ch)
                {
                    case 1:
                        System.out.println("You ordered "+ch);
                        System.out.println("Flavour is: "+"Chocolate");
                        System.out.println("Enter number of scoops: ");
                        n=Integer.parseInt(br.readLine());
                        System.out.println("Price of scoop is "+"Rs.50");
                        ans=ans+(n*50);
                        break;
                    case 2:
                        System.out.println("You ordered "+ch);
                        System.out.println("Flavour is: "+"Vanilla");
                        System.out.println("Enter number of scoops: ");
                        n=Integer.parseInt(br.readLine());
                        System.out.println("Price of scoop is "+"Rs.40");
                        ans=ans+(n*40);
                        break;    
                    case 3:
                        System.out.println("You ordered "+ch);
                        System.out.println("Flavour is: "+"Strawberry");
                        System.out.println("Enter number of scoops: ");
                        n=Integer.parseInt(br.readLine());
                        System.out.println("Price of scoop is "+"Rs.60");
                        ans=ans+(n*60);
                        break;    
                    case 4:
                        System.out.println("You ordered "+ch);
                        System.out.println("Flavour is: "+"Butter scotch");
                        System.out.println("Enter number of scoops: ");
                        n=Integer.parseInt(br.readLine());
                        System.out.println("Price of scoop is "+"Rs.70");
                        ans=ans+(n*70);
                        break;   
                    case 5:
                        System.out.println("You ordered "+ch);
                        System.out.println("Flavour is: "+"Pista");
                        System.out.println("Enter number of scoops: ");
                        n=Integer.parseInt(br.readLine());
                        System.out.println("Price of scoop is "+"Rs.65");
                        ans=ans+(n*65);
                        break;
                    case 6:
                        System.out.println("You ordered "+ch);
                        System.out.println("Flavour is: "+"Tender Coconut");
                        System.out.println("Enter number of scoops: ");
                        n=Integer.parseInt(br.readLine());
                        System.out.println("Price of scoop is "+"Rs.575");
                        ans=ans+(n*75);
                        break;  
                    case 7:
                        System.out.println("You ordered "+ch);
                        System.out.println("Flavour is: "+"Mango");
                        System.out.println("Enter number of scoops: ");
                        n=Integer.parseInt(br.readLine());
                        System.out.println("Price of scoop is "+"Rs.55");
                        ans=ans+(n*55);
                        break;
                    case 8:
                        System.out.println("You ordered "+ch);
                        System.out.println("Flavour is: "+"Black Grapes");
                        System.out.println("Enter number of scoops: ");
                        n=Integer.parseInt(br.readLine());
                        System.out.println("Price of scoop is "+"Rs.80");
                        ans=ans+(n*80);
                        break;
                    case 9:
                        System.out.println("You ordered "+ch);
                        System.out.println("Flavour is: "+"Watermelon");
                        System.out.println("Enter number of scoops: ");
                        n=Integer.parseInt(br.readLine());
                        System.out.println("Price of scoop is "+"Rs.85");
                        ans=ans+(n*85);
                        break;
                    case 10:
                        System.out.println("You ordered "+ch);
                        System.out.println("Flavour is: "+"Sitaphal");
                        System.out.println("Enter number of scoops: ");
                        n=Integer.parseInt(br.readLine());
                        System.out.println("Price of scoop is "+"Rs.75");
                        ans=ans+(n*75);
                        break;    
                    default:
                        System.out.println("Sorry!!!Wrong choice");
                }
            }
            
            else if(z==2)
            {
                System.out.println("Please enter your choice: ");
                int ch=Integer.parseInt(br.readLine());
                
                switch(ch)
                {
                    case 1:
                        System.out.println("You ordered "+ch);
                        System.out.println("Beverage is: "+"Cold coffee");
                        System.out.println("Enter number of serves: ");
                        n1=Integer.parseInt(br.readLine());
                        System.out.println("Price per serves is "+"Rs.50");
                        ans1=ans1+(n1*50);
                        break;    
                    case 2:
                        System.out.println("You ordered "+ch);
                        System.out.println("Beverage is: "+"Hot chocolate");
                        System.out.println("Enter number of serves: ");
                        n1=Integer.parseInt(br.readLine());
                        System.out.println("Price per serves is "+"Rs.40");
                        ans1=ans1+(n1*40);
                        break;
                    case 3:
                        System.out.println("You ordered "+ch);
                        System.out.println("Beverage is: "+"Mocha");
                        System.out.println("Enter number of serves: ");
                        n1=Integer.parseInt(br.readLine());
                        System.out.println("Price per serves is "+"Rs.60");
                        ans1=ans1+(n1*60);
                        break;  
                    case 4:
                        System.out.println("You ordered "+ch);
                        System.out.println("Beverage is: "+"Latte");
                        System.out.println("Enter number of serves: ");
                        n1=Integer.parseInt(br.readLine());
                        System.out.println("Price per serves is "+"Rs.70");
                        ans1=ans1+(n1*70);
                        break;    
                    case 5:
                        System.out.println("You ordered "+ch);
                        System.out.println("Beverage is: "+"Frappe");
                        System.out.println("Enter number of serves: ");
                        n1=Integer.parseInt(br.readLine());
                        System.out.println("Price per serves is "+"Rs.65");
                        ans1=ans1+(n1*65);
                        break;  
                    case 6:
                        System.out.println("You ordered "+ch);
                        System.out.println("Beverage is: "+"Espresso");
                        System.out.println("Enter number of serves: ");
                        n1=Integer.parseInt(br.readLine());
                        System.out.println("Price per serves is "+"Rs.75");
                        ans1=ans1+(n1*75);
                        break;
                    case 7:
                        System.out.println("You ordered "+ch);
                        System.out.println("Beverage is: "+"Black coffee");
                        System.out.println("Enter number of serves: ");
                        n1=Integer.parseInt(br.readLine());
                        System.out.println("Price per serves is "+"Rs.55");
                        ans1=ans1+(n1*55);
                        break;  
                    case 8:
                        System.out.println("You ordered "+ch);
                        System.out.println("Beverage is: "+"Chai Tea");
                        System.out.println("Enter number of serves: ");
                        n1=Integer.parseInt(br.readLine());
                        System.out.println("Price per serves is "+"Rs.80");
                        ans1=ans1+(n1*80);
                        break;  
                    case 9:
                        System.out.println("You ordered "+ch);
                        System.out.println("Beverage is: "+"Lemon Tea");
                        System.out.println("Enter number of serves: ");
                        n1=Integer.parseInt(br.readLine());
                        System.out.println("Price per serves is "+"Rs.85");
                        ans1=ans1+(n1*85);
                        break;    
                    case 10:
                        System.out.println("You ordered "+ch);
                        System.out.println("Beverage is: "+"Fruit Juice");
                        System.out.println("Enter number of serves: ");
                        n1=Integer.parseInt(br.readLine());
                        System.out.println("Price per serves is "+"Rs.75");
                        ans1=ans1+(n1*75);
                        break;   
                    default:
                        System.out.println("Sorry!!!Wrong choice");
                }
            }
            System.out.println("Do you want to continue? If yes enter Y");
            s=br.readLine();
            s1=s.toUpperCase();
        }
        while(s1.equals("Y"));
        return(ans+ans1);
    }
}

class Bill
{
    public void display(int a)
    {
        System.out.println("                            BILL                    ");
        System.out.println("------------------------------------------------------------");
        System.out.println("Total=                              "+a);
        double st=0.12*a;
        System.out.println("Tax inculcated=                     "+st);
        System.out.println("Grand Total including taxes is Rs."+(a+st));
        System.out.println("------------------------------------------------------------");
        if((a+st)>500)
        {
            System.out.println(" ");
            System.out.println("!!!Your total is greater than 500 and thus a 10% discount is availed!!!");
            double d=0.1*(a+st);
            System.out.println("");
            System.out.println("Discounted total is             "+((a+st)-d));
            System.out.println("--------------------------------------------------------");
            
        }
        System.out.println("                    PLEASE VISIT AGAIN          ");
        System.out.println("********************************************************");
    }
}
