import jav.util.Scanner;
import java.util.Arrays;
class BinarySearch
{
	public static void main(String[] args) {
		int[] a = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter element in array");
		for(int i=0; i<5;i++)
		{
			a[i] = sc.nextInt();
		}

		System.out.println("enter an element to find its position ");
		int n = sc.nextInt();
		Arrays.sort(a);
		System.out.println("element found at position " + Arrays.binarySearch(a,n));
	}

}