import java.util.*;
class codeathon1
{
	public static void main(String[] args) {
		int a[] = new int[5];
		int b[] = new int[5];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter element in first array");
		for(int i=0;i<5;i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.println("enter element in second array");
		for(int i=0;i<5;i++)
		{
			b[i] = sc.nextInt();
		}
		int c[] = new int[a.length+b.length];
		System.out.println("the resultant array is...");
		for(int i=0;i<=c.length;i++)
		{
			c[i] = a[i];
			c[i++] = b[i];
		}
		for(int i:c)
		{
			System.out.println(i);
		}

	}
}