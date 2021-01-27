import java.util.Scanner;

public class InverteMaxMin
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int vet[] = new int [n];
        if(n>1)
        {
                for(int i = 0; i < n; i++)
            {
                vet[i] = scan.nextInt();
            }
            
                int guardarMax, guardarMin;
                
            if(vet[0]>=vet[1])
            {
                guardarMax = 0;
                guardarMin = 1;
            }
            else{
                guardarMax = 1;
                guardarMin = 0;
            }
            for(int i = 2; i < n; i++ )
            {
                if(vet[guardarMax]<vet[i])
                {
                    guardarMax =  i;
                }
            }
            for(int i = 2; i < n; i++ )
            {
                if(vet[guardarMin]>vet[i])
                {
                    guardarMin =  i;
                }
            }
            if(guardarMax != guardarMin)
            {
                int guardar = vet[guardarMax];
                vet[guardarMax] = vet[guardarMin];
                vet[guardarMin] = guardar;
            }
            
            for(int i = 0; i < n; i++)
            {
                System.out.printf("%d%c", vet[i], i == n-1 ? '\n' : ' ');
            }
        }
        else
        {
            vet[0] = scan.nextInt();
            System.out.println(vet[0]);
        }
        
    }
   
}