import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner el= new Scanner(System.in);
      int n1=el.nextInt();
      int n2=n1%100;
      int n3=n2/10;
      System.out.print(n3);
	}
}