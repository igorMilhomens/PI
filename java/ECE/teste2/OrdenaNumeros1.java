import java.util.Scanner;

public class OrdenaNumeros1
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
        
        for(int i= 0; i< n; i++)
        {
         System.out.printf("%d%c", vet[i], i<n-1 ?  ' ' : '\n') ;  
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