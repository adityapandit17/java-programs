import java.util.Scanner;
public class Atm
{
    public static void main(String args[] )
    { 
        int balance = 0, withdraw, deposit;
        Scanner s = new Scanner(System.in);
        while(true)
        {
            System.out.println("ATM");
            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for Check Balance");
            System.out.println("Choose 4 for EXIT");
            System.out.print("Choose the operation you want to perform:");
            int n = s.nextInt();
            switch(n)
            {
                case 1:
                System.out.print("Enter money to be withdrawn:");
                withdraw = s.nextInt();
                if(balance >= withdraw)
                {
                    balance = balance - withdraw;
                    System.out.println("Please collect your money");
                    int twothousand = 2000;
        int fivehundred = 500;
        int hundred = 100;
        int fifty = 50;
        int account = 0;
        int two=0,five=0,hund=0,fif=0;
        Scanner sc = new Scanner(System.in);
        while(withdraw>=twothousand)
        {
        if (withdraw>=twothousand) {
            two++;
            withdraw = withdraw-twothousand;
        }

    }
    while(withdraw>=fivehundred)
    {
        if(withdraw>=fivehundred)
        {
            five++;
            withdraw = withdraw-fivehundred;
        }
    }
    while(withdraw>=hundred)
        {
        if (withdraw>=hundred) {
            hund++;
            withdraw = withdraw-hundred;
        }

    }
    while(withdraw>=fifty)
        {
        if (withdraw>=fifty) {
            fif++;
            withdraw = withdraw-fifty;
        }

    }
    System.out.println("no. of  2000 notes are"+  " " +two);
    System.out.println("no. of  500  notes are"+  " " +five);
    System.out.println("no. of  100  notes are"+  " " +hund);
    System.out.println("no. of  50   notes are"+  " " +fif);
                }
                else
                {
                    System.out.println("Insufficient Balance");
                }
                System.out.println("");
                break;
 
                case 2:
                System.out.print("Enter money to be deposited:");
                deposit = s.nextInt();
                balance = balance + deposit;
                System.out.println("Your Money has been successfully depsited");
                System.out.println("");
                break;
 
                case 3:
                System.out.println("Balance : "+balance);
                System.out.println("");
                break;
 
                case 4:
                System.exit(0);
            }
        }
    }
}