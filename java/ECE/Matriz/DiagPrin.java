import java.util.Scanner;
import java.util.Random;

public class DiagPrin
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random (); //criar numeros aleatorios
        
        System.out.println("Entre com n = dimensao da matriz");
        
        int i, j, n;
        n = scan.nextInt();
        int[][] A = new int [n][n];
        
        System.out.println("A = ");
        
        for(i = 0; i < n; i++)
        {
            for(j = 0; j < n; j++)
            {
                A [i][j] = rand.nextInt(100);
                
                System.out.printf( " %2d", A[i][j] );
            }
            System.out.println(" ");
        }
        
        System.out.println("\nSua diagonal eh");
        
        for(i=0; i < n; i++) System.out.println(A[i][i]);
    }
}