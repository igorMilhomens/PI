import java.util.Scanner;

public class Ampulheta2
{
    public static void main ( String [] args)
    {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        int [][] M = new int [n][n];
        int []vet = new int [7];
        
         for(int i=0; i < n; i++)
        {   
            for(int j = 0; j<n; j++)
            {
                M[i][j] = scan.nextInt();
            }
        }
        
        int aux = -1000;
        
        for(int i = 2; i < n; i++)
        {
            for(int j = 2; j < n; j++)
            {
                int cont = 0;
                
                vet[0] = M[i-2][j-2];
                vet[1] = M[i-2][j-1];
                vet[2] = M[i-2][j];
                vet[3] = M[i-1][j-1];
                vet[4] = M[i][j-2];
                vet[5] = M[i][j-1];
                vet[6] = M[i][j];
                
                for(int k = 0; k < 7; k++)
                {
                    cont+= vet[k];
                }
                
                if(aux < cont)
                {
                    aux = cont;
                }
            }
        }
        
        System.out.println(aux);
    }
}
