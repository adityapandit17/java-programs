class Constructor
{
  	String name;
  	String branch;
  	int age;
	Constructor(String name,String branch,int age)
	{
		this.name = name;
		this.branch = branch;
		this.age = age;
	}
	void display()
	{
		System.out.println(name);
		System.out.println(branch);
		System.out.println(age);
	}
	public static void main(String[] args) {
		Constructor c1 = new Constructor("aditya","cs",19);
		c1.display();
	}
}