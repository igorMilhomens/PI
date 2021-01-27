import java.util.Scanner;

public class MatSomaColK
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int [][] M = new int[n][n];
        
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                M[i][j] = scan.nextInt();
            }
        }
        
        int result = 0;
        
        for(int i=0; i < n; i++)
        {
            result += M[i][k];
        }
        
        System.out.println(result);
    }
}