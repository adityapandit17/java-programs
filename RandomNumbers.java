import java.util.Random;

class RandomNumbers {

  public static void main(String args[]) {

    Random number = new Random();

    for(int i = 0; i < 10; i++)
      System.out.println(number.nextInt(100));
  }
}