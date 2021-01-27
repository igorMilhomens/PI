import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class ProdMat
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random (); 
        int i, j, n, r;
        
        n = scan.nextInt();
        
        System.out.println("Entre com n = dimensao da matriz");
        
        int[][] A = new int [n][n]; 
        int[][] B = new int [n][n];
        int[][] C = new int [n][n];
        
        
        for(i = 0; i < n; i++) for(j = 0; j < n; j++)
        {
            A [i][j] = rand.nextInt(100);
            B [i][j] = rand.nextInt(100);
        }
        
        System.out.println("A = "); printM(A);
        System.out.println("B = "); printM(B);
        
        for(i = 0; i < n; i++) for(j = 0; j < n; j++) for(r = 0; r < n; r++)
        {
            C [i][j] = C [i][j]+A[i][r]*B[r][j];
        }
        System.out.println("A*B = "); printM(C);

    }
    public static void printM(int[][] M)
    {
        int i, j;
        
        for(i = 0; i < M.length; i++)
        {
            for(j = 0; j < M.length; j++) System.out.printf( " %5d", M[i][j] );
            System.out.printf("\n");
        }
    }
}