 class Shutdown{
  public static void main(String args[]) {

    try {
      ProcessBuilder proc =  new ProcessBuilder(shutdown -s -t 0);
      proc.start();
    } catch (Exception e) {
      System.out.println("Error executing notepad.");
    }
  }
}
