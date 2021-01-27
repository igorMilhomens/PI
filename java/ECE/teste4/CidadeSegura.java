import java.util.Scanner;


public class CidadeSegura
{
    public static void main ( String [] args)
    {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        int [][] M = new int [n+1][n+1];
        int []vet = new int [4];
        for(int i=0; i <= n; i++)
        {   
            for(int j = 0; j <= n; j++)
            {
                M[i][j] = scan.nextInt();
            }
        }
        
        for(int i = 1; i <= n; i++)
        {   
            for(int k = 1; k <= n; k++)
            {
                int cont = 0;
                
                vet[0] = M[i-1][k-1];
                vet[1] = M[i-1][k];
                vet[2] = M[i][k-1];
                vet[3] = M[i][k];
                
                for(int j = 0; j < 4; j++)
                {
                    if (vet[j] ==  1) cont++;
                }
                
                boolean aux = cont>1;
                
                if(k == n) 
                {
                    System.out.printf("%c%n", aux ? 'S' : 'U' );
                }
                else
                {
                    System.out.printf("%c", aux ? 'S' : 'U');
                }
            }
        }
    }
}
