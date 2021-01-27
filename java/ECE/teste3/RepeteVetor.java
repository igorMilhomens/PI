import java.util.Scanner;

public class RepeteVetor
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();
        int o = scan.nextInt();
        
        int [] vetor = new int[o];
        
        for(int i = 0; i < o; i++)
        {
            vetor[i] = scan.nextInt();
        }
        
        if (m == 0)
        {
            int [][] M = mLinha(vetor, o, n);
            
            for(int i = 0; i < n; i++)
            {
                for(int j = 0; j < o; j++)
                {
                    System.out.printf("%d%c", M [i][j], (j== o-1)? '\n' : ' ');
                }
            }
        }
        else
        {
            int [][] M = mColuna(vetor, o, n);
            
            for(int i = 0; i < o; i++)
            {
                for(int j = 0; j < n; j++)
                {
                    System.out.printf("%d%c", M [i][j], (j== n-1)? '\n' : ' ');
                }
            }
        }
    }
    public static int [][] mLinha(int []vetor, int o, int n)
    {
        int [][] M = new int [n][o];
        
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < o; j++)
            {
                M[i][j] = vetor[j];
            }
        }
        return M;
    }
    public static int [][] mColuna(int []vetor, int o, int n)
    {
        int [][] M = new int [o][n];
        
        for(int i = 0; i < o; i++)
        {
            for(int j = 0; j < n; j++)
            {
                M[i][j] = vetor[i];
            }
        }
        return M;
    }    
}