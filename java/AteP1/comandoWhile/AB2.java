import java.util.Scanner;

public class AB2
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int i, a, b, x, par, j;
        
        
        a=scan.nextInt();
        b=scan.nextInt();
        i=0;
        j=0;
    
        while(i<=(b-a))
        {
            x=a+i;
            i=i+1;
            par = x%2;
            if(par == 0)
            {
                System.out.print(" "+x);
            }
            
        }
        
        System.out.println();
        
        while(j<=(b-a))
        {
            x=a+j;
            j=j+1;
            par = x%2;
            if(par != 0)
            {
                System.out.print(" "+x);
            }
            
        }
        System.out.println();
    }
}