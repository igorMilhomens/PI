import java.util.Scanner;

public class IndicesPares
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int vetor[] = new int[n];
        int contador =0;
        
        for(int i = 0; i < n; i++)
        {
            vetor[i] = scan.nextInt();
            if(vetor[i]%2 == 0)
            {
                contador++;
            }
        }
        for( int i = 0; i < n; i += 2)
        {
            System.out.printf("%d%c", vetor[i], ' ');
            
        }
        System.out.printf("%d%n", contador);
    }
    
}