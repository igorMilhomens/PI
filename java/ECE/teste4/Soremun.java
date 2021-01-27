import java.util.Scanner;

public class Soremun
{
    public static void main ( String [] args)
    {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        int [] vet  = new int [4]; 
        
        for(int i = 0; i < 4; i++)
        {
            if(i<3)
            {
                vet[i] = n%10;
                n = n/10;
            }
            else
            {
                vet[i] = n;
            }
            
        }
        
        System.out.printf("%d%d%d%d%n", vet[0], vet[1], vet[2], vet[3]);
    }
}
