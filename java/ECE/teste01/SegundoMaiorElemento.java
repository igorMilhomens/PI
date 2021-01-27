import java.util.Scanner;

public class SegundoMaiorElemento
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
        if(n==2)
        {
            if(vet[0]>=vet[1])
            {
                System.out.println("1 " + vet[1]);
            }
            else
            {
                System.out.println( "0 " + vet[0]);
            }
        }
        else
        {
            int segundoMaior = result(vet,n);
        
            System.out.printf("%d%c%d%n", segundoMaior , ' ', vet[segundoMaior] );   
        }
        
    }
    
    public static int result(int [] vet, int n)
    {
        int guardar = 0, segMaior =0 ;
        
        for(int i = 1; i < n; i++ )
        {
            if(vet[guardar]<vet[i])
            {
                guardar =  i;
            }
        }
        
        if(guardar==0)
        {
            segMaior = 1;
            
            for(int i = 2; i < n; i++)
            {
                if(vet[segMaior]<vet[i])
                {
                    segMaior =  i;
                }
            }
        }
        else
        {
            segMaior = 0;
            
            for(int i = 1; i < n; i++)
            {
                if(guardar != i)
                {
                    
                    if(vet[segMaior]<vet[i])
                    {
                        segMaior =  i;
                    }
                }
                
            }
        }
 
        return segMaior;
    }    
}
