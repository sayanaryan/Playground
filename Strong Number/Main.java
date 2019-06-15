import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      int r,sum=0,i;
      
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int t=n;
      while(n>0)
      {
        r=n%10;
        int f=1;
        for(i=1;i<=r;i++)
        {
        f=f*i;
        }
       sum+=f;
        n/=10;
      }
      if(sum==t)
      {
      System.out.println("Yes");
      }
      else
      {
        System.out.println("No");
      }
	}
}