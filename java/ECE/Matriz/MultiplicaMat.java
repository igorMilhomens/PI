import java.util.Scanner;

public class MultiplicaMat
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        int m = scan.nextInt();
        int n = scan.nextInt();
        int p = scan.nextInt();
        
        int A[][] = new int [m][n];
        int B[][] = new int [n][p];
        
        
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                A[i][j] = scan.nextInt();
            }
        }
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                B[i][j] = scan.nextInt();
            }
        }
        
        int matMult[][] = prodMat(A, B, m, n, p);
        
        System.out.printf("Matriz tamanho tem tamanho %dx%d\n", m, p);
        
        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < p; j++)
            {
                System.out.printf("%d%c", matMult[i][j], (j== n-1)? '\n' : ' ');
            }
        }
        
    }
        
    public static int prodInt(int A[][], int B[][], int i, int j, int n)
    {
        int res = 0;
      
        {
            for (int k = 0; k < n; k++)
            {
                res += A[i][k] * B[k][j];
            }
        }
        
        return res;
    }
    
    public static int[][] prodMat(int A[][], int B[][], int m, int n, int p )
    {
        int res1[][] = new int[m][n];
        
        for(int i = 0; i < m; i++)
        {
            
            
            for(int j=0; j < p; j++)
            {
                res1[i][j] = prodInt(A, B, i, j, n);
                
            }
        }
        
        return res1;
    }
}













