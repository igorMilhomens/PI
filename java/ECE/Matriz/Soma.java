import java.util.Scanner;

public class Soma
{
    public static int[][] soma(int matA[][], int matB[][])
    {
        int n = matA.length;
        int matC[][] = new int [n][n];
        
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                matC[i][j] = matA[i][j] + matB[i][j];
            }
        }
        
        return matC;
        
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        int matA[][] = new int [n][n];
        int matB[][] = new int [n][n];
        int matSoma[][] = soma(matA,matB);
        
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                matA[i][j] = scan.nextInt();
            }
        }
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                matB[i][j] = scan.nextInt();
            }
        }
        
        System.out.printf("Matriz Soma tem tamanho %dx%d\n", n, n);
        
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                System.out.printf("%d%c", matSoma[i][j], (j== n-1)? '\n' : ' ');
            }
        }
        
    }
}