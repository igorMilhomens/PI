import java.util.Scanner;

public class MatSomaLin
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [][] M = new int[n][n];
        
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                M[i][j] = scan.nextInt();
            }
        }
        
        for(int i = 0; i < n; i++)
        {
            int result = 0;
            for(int j = 0; j < n; j++)
            {
                result += M[i][j];
            }
            System.out.println(result);
        }
    }
}