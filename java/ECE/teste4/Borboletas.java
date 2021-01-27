import java.util.Scanner;
import java.util.Arrays;

public class Borboletas
{
    public static void main ( String [] args)
    {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        int [][] M = new int [n][n];
        int [] vet = new int [2*n];
         for(int i=0; i<n; i++)
        {   
            for(int j = 0; j<n; j++)
            {
                M[i][j] = scan.nextInt();
            }
        }
        
         for(int i=0; i<2*n; i++)
        {
            int x = scan.nextInt();
            int y = scan.nextInt();
            
            vet[i] = M[x-1][y-1];
        }
        Arrays.sort(vet);
        
        int cont = 1;
        for(int i=1; i<2*n; i++)
        {
            if(vet[i-1] != vet[i])
            {
                cont++;
            }
        }
        
        System.out.println(cont);
    }
}
