import java.util.*;
class ArrayListExample
{
	public static void main(String[] args) {
		ArrayList<Integer> al  = new ArrayList<Integer>();
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		al.add(7);
		

		for(int i: al)
		{
			System.out.println(i);
		}
	}
}
