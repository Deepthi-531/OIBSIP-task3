import java.util.Scanner;
public class atm
{
    public static void main(String args[])
    { 
        int bal = 5000, withdraw, deposit;
        Scanner sc = new Scanner(System.in);
        int pin=20531;
        System.out.println("Please enter your atm pin : ");
        int pwd=sc.nextInt();
        if(pwd!=pin)
        {
            while(true)
            {
            System.out.println("Wrong pin Number! ");
            System.out.println("Please Re-enter your pin : ");
            pwd=sc.nextInt();
            if(pwd==pin)
            {
                break;
            }
            }
        }
        if(pwd==pin)
        {
            System.out.println("WELCOME");  
            while(true)
            {
                System.out.println("Enter 1 to Check your Balance amount");
                System.out.println("Enter 2 to Withdraw money");
                System.out.println("Enter 3 to Deposit money");
                System.out.println("Enter 4 to QUIT");
                System.out.print("Choose what you option: ");
                int choice = sc.nextInt();
                switch(choice)
                {
                    case 1:
                    System.out.println("Your Balance is : "+bal);
                    System.out.println("");
                    break;
                    case 2:
                    System.out.println("Enter amount to Withdraw : ");
                    withdraw=sc.nextInt();
                    if(withdraw>bal||bal==0)
                    {
                        System.out.printf("You have insufficient balance!!\n");
                        break;
                    }
                    System.out.println("Collect your money!");
                    bal=bal-withdraw;
                    System.out.println("");
                    break;
                    case 3:
                    System.out.print("Enter money to be deposited: ");
                    deposit = sc.nextInt();
                    bal = bal + deposit;
                    System.out.println("Your Money has been successfully deposited");
                    System.out.println(" ");
                    break;

                    case 4:
                    System.out.println("Thank you!");
                    System.exit(0);
                }
            }
       }
    }}