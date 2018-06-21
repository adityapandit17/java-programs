import java.util.Scanner;
class Addition
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first no.");
		int a = sc.nextInt();
		System.out.println("enter second no.");
		int b = sc.nextInt();
		int c = a+b;
		System.out.println("Addition is =  "+c);
	}
}