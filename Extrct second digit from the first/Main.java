import java.util.Scanner;
import java.io.*;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      while(n>99)
      {
        n=n/10;
      }
      System.out.println(n%10);
    }
}