import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner el=new Scanner(System.in);
      int n1=el.nextInt();
      int n2=el.nextInt();
      int n3=el.nextInt();
      if(n1>n2 && n1>n3)
      {
         System.out.print(n1);  
      }
      else if(n2>n1 && n2>n3)
        {
          System.out.print(n2);
       }
      else
      {
        System.out.print(n3);
      }
}
}