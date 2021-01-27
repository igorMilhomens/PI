import java.util.Scanner;

public class MatTransposta
{
    public static int[][] transpor(int matA[][], int l, int c)
    {
        
        if(l==0)
        {
            return new int[0][];
        }
        else
        {
            int matC[][] = new int [c][l];
        
            for(int i = 0; i < l; i++)
            {
                for(int j = 0; j < c; j++)
                {
                    matC[j][i] = matA[i][j];
                }
            }
            return matC;
        }
        
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        int l = scan.nextInt();
        int c = scan.nextInt();
        int matA[][] = new int [l][c];
        
        for(int i = 0; i < l; i++)
        {
            for(int j = 0; j < c; j++)
            {
                matA[i][j] = scan.nextInt();
            }
        }
        int mat[][] = transpor(matA, l , c);
        
        System.out.printf("Matriz Transposta tem tamanho %dx%d\n", c, l);
        
        for(int i = 0; i < c; i++)
        {
            for(int j = 0; j < l; j++)
            {
                System.out.printf("%d%c", mat[i][j], (j == l-1)? '\n' : ' ');
            }
        }
        
    }
}