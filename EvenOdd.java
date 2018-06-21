class EvenOdd
{
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("enter any no. to check even or odd");
        int x = sc.nextInt();
        if (x%2==0)
        {
            System.out.println("no. is even ");

        }
        else
        {
            System.out.println("no. is odd");
        }
    }
}