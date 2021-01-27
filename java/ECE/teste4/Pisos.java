import java.util.Scanner;

public class Pisos
{
    public static void main ( String [] args)
    {
        Scanner scan = new Scanner(System.in);
        
        int l = scan.nextInt();
        int c = scan.nextInt();
        
        int cont1 = (c*l)+((c-1)*(l-1));
        int cont2 = (2*(c-1))+(2*(l-1));
        
        System.out.printf("%d%n%d%n", cont1, cont2 );
    }
}
