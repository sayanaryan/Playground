import java.util.*;
class Main {
	public static void main (String[] args) {
		Scanner el=new Scanner(System.in);
      int n1=el.nextInt();
      int n2= n1/10;
      int n3= n1%10;
      int n4= n2+n3;
      System.out.print(n4);
	}
}