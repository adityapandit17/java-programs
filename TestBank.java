abstract class Bank{    
abstract int getRateOfInterest();    
}    
class SBI extends Bank
{ 

int getRateOfInterest(){
	
	// x = x+((x/100)*7);
	return 8 ;
}    
}    
class PNB extends Bank
{    
int getRateOfInterest(){
// x = x+((x/100)*7);
	return 9 ;
	}    
}
class Icici extends Bank
{    
int getRateOfInterest(){

// x = x+((x/100)*7);
	return 5 ;
	}    
}    
class Hdfc extends Bank{    
int getRateOfInterest()
{

// x = x+((x/100)*7);
	return 6 ;
}    
}    
    
class TestBank{    
public static void main(String args[]){    
java.util.Scanner sc = new java.util.Scanner(System.in);
int x = sc.nextInt();    
Bank b;  
b=new SBI();  
System.out.println("Rate of Interest is: "+b.getRateOfInterest()+" %");    
b=new PNB();  
System.out.println("Rate of Interest is: "+b.getRateOfInterest()+" %");
b=new Icici();  
System.out.println("Rate of Interest is: "+b.getRateOfInterest()+" %");
b=new Hdfc();  
System.out.println("Rate of Interest is: "+b.getRateOfInterest()+" %"); 
}
}    