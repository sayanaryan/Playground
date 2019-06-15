import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		Scanner st= new Scanner(System.in);
          int n1=st.nextInt();
      int n2= n1/100;
      int n4=n1%10;
      int sayan= n2+n4;
      System.out.println(sayan);
	}
}