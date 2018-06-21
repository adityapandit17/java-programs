import java.util.*;
class BankLoan
{
	//method
	public void emi(int r)
	{
		double rate = r;
        
        Scanner sc = new Scanner(System.in);

        double principal, time, emi;
  
        System.out.print("Enter loan amount: ");
        principal = sc.nextFloat();
      
              
        System.out.print("Enter time in year: ");
        time = sc.nextFloat();
      
        rate=rate/(12*100); 
        time=time*12; 
      
      
        emi= (principal*rate*Math.pow(1+rate,time))/(Math.pow(1+rate,time)-1);
      
        System.out.println("loan amount is  "+principal);
        System.out.print("Monthly EMI is= "+emi+"\n");
  		System.out.println(" ");
  		System.out.println(" ");
  		System.out.println(" ");      
        
	}
	public static void main(String[] args) {
		//String bank_name;
		while(true)
		{
				System.out.println("choose bank name");
				System.out.println("press 1 for state bank of india");
				//break;
				System.out.println("press 2 for international banks");
				//break;
				System.out.println("press 3 for other national banks");
				//break;
				System.out.println("press 4 for exit");
				//System.out.println("You have selected bank "+bank_name);
				BankLoan bl = new BankLoan();
				Scanner sc = new Scanner(System.in);
				int choose = sc.nextInt();
				switch (choose) {
					case 1 :
					bl.emi(14);
					break;
					case 2 :
					bl.emi (15);
					break;
					case 3 :
					bl.emi(13);
					break;
					case 4 :
					System.exit(0);
		}

		}
	}
}