import java.util.Scanner;

public class AB
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int i, a, b, x;
        
        a=scan.nextInt();
        b=scan.nextInt();
        i=0;
        
    
        while(i<=(b-a))
        {
            x=a+i;
            i=i+1;
            System.out.print(" "+x);
        }
        System.out.println();
    }
}