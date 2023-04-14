import java.util.*;
public class Replacewithchar 
{
    public static void main (String args [])
    {
        System.out.println("Enter the string to be modified");
        Scanner sc = new Scanner (System.in);
        String str = sc.nextLine();
        String result = " ";

        for(int i=0; i< str.length(); i++)
        {
            if (str.charAt(i) == 'e')
            {
                result = result + 'i';
            }
            else
            result = result +  str.charAt(i);
        }

        System.out.println("The modified string is : " + result);
        sc.close();
    }
    
}
