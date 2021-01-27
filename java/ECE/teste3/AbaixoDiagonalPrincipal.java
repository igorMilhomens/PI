import java.util.Scanner;

public class AbaixoDiagonalPrincipal
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        char letra = scan.next().charAt(0);
        int n = scan.nextInt();
        int[][] M = new int [n][n];
        
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                M [i][j] = scan.nextInt();
            }
    
        }
        
        int [] result = soma(M,n);
        
        if(letra == 'S')
        {
            double x = result[0];
            System.out.printf("%.1f%n", x);
        }
        else
        {
            if(result[1] == 0)
            {
                System.out.println("0.0");
            }
            else
            {
                double x = result[0];
                double y = result[1];
                double media = x/y;
            
                System.out.printf("%.1f%n", media);
            }
            
        }
    }
    public static int [] soma(int M[][], int n)
    {
        int[] soma = new int[2];
        soma[0] = 0;
        soma[1] = 0;
        
        for(int i = 1; i < n; i++)
        {
            for(int j = 0; j < i; j++)
            {
                soma[0] += M [i][j];
                soma[1] ++;
            }
        }
        return soma;
    }
}