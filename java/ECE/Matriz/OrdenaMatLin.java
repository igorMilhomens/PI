import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class OrdenaMatLin
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random (); 
        
        int i, j;
        int [] d = new int[2];
        
        System.out.println("Digite as dimensoes m e n da matriz");
        
        for(i = 0; i < 2 ; i++) d[i] = scan.nextInt();
        
        int[][] A = new int [d[0]][d[1]];

        System.out.println("A = ");
        
        for(i = 0; i < d[0]; i++)
        {
            for(j = 0; j < d[1]; j++)
            {
                A [i][j] = rand.nextInt(100);
                
                System.out.printf( " %2d", A[i][j] );
            }
            System.out.printf("\n");
        }
        
        System.out.println("\n Linhas Ordenadas: ");
        
        for(i=0; i<d[0]; i++)
        {
            Arrays.sort(A[i]);
            System.out.printf(Arrays.toString(A[i]));
            System.out.println(" ");
        }
    }
}