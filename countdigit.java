package function;
import java.util.*;

public class countdigit 
{ 
    static int digitlen(int a)
    {
        int len=0;
        while(a>0)
        {
            len=len+1;
            a=a/10;
        }
        return len;
    }
    
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        int length=digitlen(n);
        System.out.println("The count of digit in the number "+n+" is "+length);
        
    }
}
