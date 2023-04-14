import java.util.*;

public class Towerofhanoi 
{
    public static void TowerofHanoi (int n, String src, String help, String dest)
    {
        if (n==1)
        {
            System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
            return;
        }
        TowerofHanoi (n-1,src,dest,help);
        System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
        TowerofHanoi (n-1,help,src,dest);
        return;

    }

    public static void main (String args [])
    {
        System.out.println("Enter the no. of disks");
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();

        TowerofHanoi (n, "S", "H", "D");

        sc.close();
    }
    
}
