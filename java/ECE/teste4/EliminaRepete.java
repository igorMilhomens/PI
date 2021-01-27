import java.util.Scanner;

public class EliminaRepete
{
    public static void main(String[] args)
    {
        
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        
        int [] vetor = new int[n];
        
        for(int i=0; i<n; i++)
        {
            vetor[i] = scan.nextInt();
        }
        String vet = "";
        vet += vetor[0];
        
        for(int i = 1; i < n; i++)
        {
            int aux = 0;
            for(int j = 0; j<i; j++)
            {
                if (vetor[i] == vetor[j])
                {
                    aux++;
                }
                if (j== i-1 && aux == 0)
                {
                    vet += " ";
                    vet += vetor[i];
                }
            }
        }
        System.out.println(vet);
    }
}