import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      int i;
       Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int count=0;
      for(i=1;;i++)
      {
        if(i%2==1)
        {
          count=count+1;
        System.out.println(i);
        }
        if(count==n)
        {
          break;
        }
      }
      
	}
}