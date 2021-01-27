import java.util.Scanner;

public class Mediana
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int vet[] = new int [n];
        
        for(int i = 0; i < n; i++)
        {
            vet[i] = scan.nextInt();
        }
        
        ordenar(vet, n);
        
        if(n%2 == 0)
        {
            double mediana = (double)(vet[n/2] + vet[n/2-1])/2;
            System.out.printf("%.2f%n", mediana);
        }
        else
        {
            double impar = vet[n/2];
            System.out.printf("%.2f%n", impar);
        }

    }
    
    public static void ordenar(int[] vet, int n)
    {
        int ordena;
        
        for(int i = 0; i < n-1; i++)
        {
            for(int j = 0; j < n-i-1; j++)
            {
                if(vet[j] > vet[j+1])
                {
                    ordena = vet[j];
                    vet[j] = vet[j+1];
                    vet[j+1] = ordena;
                }
            }
        }
    }
}