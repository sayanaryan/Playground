import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //your code here;
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    int i,j,k;
    for(i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
    }
    for(i=0;i<n;i++)
    {
      for(j=i+1;j<n;j++)
      {
        if(a[i]<a[j])
        {
          System.out.println(a[i]+","+a[j]);
        }
      }
    }
  }
}
