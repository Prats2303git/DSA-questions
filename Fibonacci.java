import java.util.*;
public class Fibonacci 
{
    public static void main (String args [])
    {
        System.out.println("Enter the no of terms needed in the fibonacci series");
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();

        int f=0;
        int s=1;
        System.out.print(f + " " + s + " ");
        
        for(int i=2; i<=n; i++)
        {
            int t = f+s;
            f=s;
            s=t;
            System.out.print(t + " ");
        }
        sc.close(); 
    }
}
