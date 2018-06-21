import java.util.*;
class codeathon2
{
	public static void main(String[] args) {
		int[] a = new int[5];
		ArrayList<Integer> al = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 5 element in array");
		for(int i=0;i<5;i++)
		{
			a[i] = sc.nextInt();
		}
		

		for(int i=0;i<a.length;i++)
		{

			while(a[i] != 0) {
            int k = a[i] % 10;
            al.add(k);
            a[i] /= 10;
        }

			// int k = a[i]%10;
			// al.add(a[i]);
			// k = a[i]/10;
			// al.add(a[i]);
		
		}

		Collections.sort(al);
		Collections.reverse(al);
		System.out.println("the maximum Integer value that can be possible is...");

		for(int j:al)
		{
			System.out.print(j);
		}

	}
}