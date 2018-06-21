class TwoMain1
{
	
		public static void main(String args[]){
        System.out.println("Hello");
        
}
 
}

class B extends TwoMain1
{

	public static void main(String args[])
	{
		TwoMain1 a = new TwoMain1();
		String[] arr = {"hello","world"};
		a.main(arr);
        System.out.println("World");
	}


}