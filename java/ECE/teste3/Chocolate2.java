import java.util.Scanner;

public class Chocolate2
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        int l = scan.nextInt();
        int c = scan.nextInt();
        
        int [][] M = new int[l][c];
        
        for(int i = 0; i < l; i++)
        {
           for(int j = 0; j < c; j++)
           {
               M[i][j] = scan.nextInt();
           }
        }
        int d = scan.nextInt();
        int m = scan.nextInt();
        
        int result1 = quantidade1(M, l, c, d, m);
        int result2 = quantidade2(M, l, c, d, m);
        int result = result1 + result2;
        
        System.out.println(result);
        
    }
    public static int quantidade1(int [][]M, int l, int c, int d, int m)
    {
        int cont = 0;
        
        for(int i = 0; i < l; i++)
        {
            for(int j = 0; j <= c - m; j++)
            {
                int aux = 0;
                
                for(int k = 0; k < m; k++)
                {
                    aux += M[i][j+k];
                }
                if(aux == d)
                {
                    cont ++;
                }
            }
        }
        
        return cont;
    }
    public static int quantidade2(int [][]M, int l, int c, int d, int m)
    {
        int cont1 = 0;
        
        for(int i = 0; i < c; i++)
        {
            for(int j = 0; j <= l - m; j++)
            {
                int aux1 = 0;
                
                for(int k = 0; k < m; k++)
                {
                    aux1 += M[j+k][i];
                }
                if(aux1 == d)
                {
                    cont1 ++;
                }
            }
        }
        return cont1;
    }
}