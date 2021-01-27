import java.util.Scanner;

public class Impeachment
{
    public static void main ( String [] args)
    {
        Scanner scan = new Scanner(System.in);
        double cont = 0;
        
        while(scan.hasNext())
        {
            cont = 0;
            int n = scan.nextInt();
            
            double imp = (double)2/3*n;
            
            
            for(int i = 0; i < n; i++)
            {
                int v = scan.nextInt();
                
                if(v == 1)
                {
                    cont++;
                }
            }
            
            if(cont >= imp)
            {
                System.out.println("impeachment");
            }
            else
            {
                System.out.println("acusacao arquivada");
            }
        }
    }
}