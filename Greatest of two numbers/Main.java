import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner el= new Scanner(System.in);
      int n1 = el.nextInt();
      int n2 = el.nextInt();
      if(n1>n2)
        System.out.print("num1 is the greatest number");
      else
        System.out.print("num2 is the greatest number");
	}
}