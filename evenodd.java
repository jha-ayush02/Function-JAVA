package function;
import java.util.*;

public class evenodd 
{
    //Function for EvenOdd
    static void evod(int a,int b)
    {
        System.out.println("Even Numbers are:");
        for(int i=a;i<=b;i++){
            int num=i;
            if(num%2==0){
                System.out.print(num+"\t");
            }
        }
        System.out.println("\n");
        System.out.println("Odds Numbers are: ");
        for(int i=a;i<=b;i++){
            int num=i;
            if(num%2!=0){
                System.out.print(num+"\t");
            }
        }

    }

       public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range to which you want to check even and odd numbers: ");
        System.out.println("Enter starting value :");
        int start=sc.nextInt();
        
        System.out.println("Enter ending  value :");
        int end=sc.nextInt();

        evod(start, end);

    }
    
}
