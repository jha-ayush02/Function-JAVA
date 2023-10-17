package function;
import java.util.*;

public class reversenum 
{
    static int reversedigit(int a)
    {
        int n=a;
        int sum=0;
        while(n>0)
        {
            int rem=n%10;
            sum=(sum*10)+rem;
            n=n/10;
        }
        return sum; 
    }

    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        int result=reversedigit(n);
        System.out.println("The reverse of the digit of number "+n+" is "+result);
        
    }
}
