package function;
import java.util.*;

public class factorial 
{
    static long fact(int k)
    {
        long sum=1;
        if(k<=1)
        return 1;
        else
        {
            sum=(k*(fact(k-1)));
            return sum;
        }
    }

    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number you want to find factorial ");
        int n=sc.nextInt();
        long result=fact(n);
        System.out.println("The factorial of  number "+n+" is "+result);
        
    }
}
