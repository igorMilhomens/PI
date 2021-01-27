import java.util.Scanner;

public class InverteMaxMin
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
        
        int vMax = max(vet,n);
        int vMin = min(vet,n);
        int guardar = vet[vMax];
        vet[vMax] = vet[vMin];
        vet[vMin] = guardar;
        
        for(int i = 0; i < n; i++)
        {
            System.out.printf("%d%c", vet[i], i == n-1 ? '\n' : ' ');
        }
    }
    
    public static int max(int [] vet, int n)
    {   
        int guardar;
        if(vet[0]>=vet[1])
        {
            guardar = 0;
        }
        else{
            guardar = 1;
        }
        for(int i = 2; i < n; i++ )
        {
            if(vet[guardar]<vet[i])
            {
                guardar =  i;
            }
        }
        return guardar;
    }
    public static int min(int [] vet, int n)
    {   
        int guardar;
        if(vet[0]<=vet[1])
        {
            guardar = 0;
        }
        else{
            guardar = 1;
        }
        for(int i = 2; i < n; i++ )
        {
            if(vet[guardar]>vet[i])
            {
                guardar =  i;
            }
        }
        return guardar;
    }
}

// apresentou Runtime erro
// teste quando vetor tem 1 valor apenas só criar uma condição.