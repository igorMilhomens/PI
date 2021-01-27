import java.util.Scanner;
import java.util.Arrays;

public class FreqMaiorMenor
{
    public static int[] valorMenor(int M [][], int n,  int m)
    {
        int [] menor = new int[2];
        menor[0] = M[0][0];
        
        for(int i = 1; i < n; i++)
        {
            if(menor[0] > M[i][0])
            {
                menor[0] = M[i][0];
            }
            
        }
        menor[1] = 0;
        
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                if(M [i][j] == menor[0])
                {
                    menor[1] ++;
                }
            }
        }
        
        return menor;
        
    }
    public static int[] valorMaior(int M [][], int n,  int m)
    {
        int [] maior = new int[2];
        
        maior[0] = M[0][m-1];
        
        for(int i = 1; i < n; i++)
        {
            if(maior[0] < M[i][m-1])
            {
                maior[0] = M[i][m-1];
            }
            
        }
        maior[1] = 0;
        
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                if(M [i][j] == maior[0])
                {
                    maior[1] ++;
                }
            }
        }
        
        return maior;
        
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        int m = scan.nextInt();
        int M[][] = new int [n][m];

        
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                M[i][j] = scan.nextInt();
            }
        }
        
        for(int i=0; i < n; i++)
        {
            Arrays.sort(M[i]);
        }
        
        int [] menor = valorMenor(M, n, m);
        int [] maior = valorMaior(M, n, m);
        double tamanho = (double) m * n;
        double percento1 = (double)(menor[1]/tamanho)*100;
        double percento2 = (double)(maior[1]/tamanho)*100;
        
        System.out.printf("%d%c%.2f%c%n", menor[0], ' ', percento1, '%');
        
        System.out.printf("%d%c%.2f%c%n", maior[0], ' ', percento2, '%');

    }
}