import java.util.Scanner;
class run
{
	public static void main(String[] args) {
		Runtime rs = Runtime.getRuntime();
		try
		{
			rs.exec("Addition.java");
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
}