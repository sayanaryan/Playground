import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int sum=0;
      int t=n;
      int r;
      while(n>0)
      {
        r=n%10;
        sum+=r*r*r;
        n/=10;
      }
      if(t==sum)
      {
      System.out.println("Armstrong Number");
      }
      else
      {
        System.out.println("Not a Armstrong Number");
      }
	}
}