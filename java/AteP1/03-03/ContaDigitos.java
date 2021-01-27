import java.util.Scanner;

public class ContaDigitos
{
    public static void main (String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        
       while(scan.hasNext())
       {
           String num = scan.next();
           System.out.println(num.length());
       }
    }
}