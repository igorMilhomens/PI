import java.util.Scanner;

public class DiagPrin
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        int[][] M = new int [n][n];
        
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                M [i][j] = scan.nextInt();
                
            }
        }
        
        for(int i=0; i < n; i++) 
        {
            System.out.println(M[i][i]);
        }
    }
}