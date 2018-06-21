import java.util.*;
import java.io.*;
 
class ShutdownByRuntime {
  public static void main(String[] args) {
    Runtime rs = Runtime.getRuntime();
 
    try {
      rs.exec("shutdown.exe");
    }
    catch (IOException e) {
      System.out.println(e);
    }   
  }
}