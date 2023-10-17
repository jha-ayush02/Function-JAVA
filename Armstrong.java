package function;
import java.util.*;
// import static java.lang.Math.log10;
public class Armstrong 
{
   
    static int power(int x, int y)
    {
        int result=1;
        for(int i=1;i<=y;i++)
        {
            result=result*x;
        }
        return result;
    }

    static int length(int a)
    {
        int len=0;
        while(a>0)
        {
            len=len+1;
            a=a/10;
        }
        return len;
    }

    static int armstng(int a)
    {
        int n=a;
        int l=length(a);
        int sum=0;
        while(n>0)
        {
            int rem=n%10;
            int s=power(rem, l);
            sum=sum+s;
            n=n/10;
        }
         if(sum==a)
         return 1;
         else
         return -1; 
    }

    public static void main(String[] args) 
    {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the number to check armstrong or not: ");
         int k=sc.nextInt();
         int res=armstng(k);
         if(res==1)
         System.out.println(k+" is an armstrong number");
         else
         System.out.println(k+" is not an arms trong number");   
    }
    
}
