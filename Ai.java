import java.io.Console;

import java.*;
class Ai
{

	public static void main(String[] args) {
		Console c=System.console();    
		System.out.println("Enter your name: ");    
		String n=c.readLine();
		System.out.println("\n\n\n\n\n\n\n");
		System.out.print("   Initialising AIPROJAP 1.0");
		for (int i=0;i<5;i++) 
		{
		System.out.print(".");	
		}
		System.out.println("   Generating Files");
		for (int i=0;i<5;i++) 
		{
		System.out.print(".");	
		}
		System.out.println("   AIPROJAP started on " + System.getProperty("os.name"));
		System.out.println("\n\n\n\n\n\n\n");
		System.out.println("Welcome "+n);
		
	}
}
