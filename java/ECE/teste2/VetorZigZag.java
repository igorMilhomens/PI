import java.util.Scanner;

public class VetorZigZag
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        int vet[] = new int[n];
        
        
        for(int i = 0; i < n; i++)
        {
            vet[i] = scan.nextInt();
        }
        
        int remover = remove(vet,n);
        
        System.out.println(remover);
    }
    public static int remove(int[] vet, int n)
    {
        int aux = 1;
        
        if(1<n)
        { 
            if(vet[0]<vet[1])
            {
                aux = -1;
            }
            else 
            {
                aux = 1;
            }
        }
            
        int contador = 0;
        
        for( int i =0; i<n-1; i++)
        {
            if(vet[i] * aux < vet[i+1]* aux)
            {
                contador +=1;
            }
            else
            {
                aux *= -1;
            }
        }
        return contador;
    }
}

 