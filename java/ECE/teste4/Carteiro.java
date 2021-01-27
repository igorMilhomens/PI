import java.util.Scanner;

public class Carteiro
{
    public static void main ( String [] args)
    {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        int m = scan.nextInt();
        
        int []casa = new int [n];
        int []encomenda = new int [m];
        
        for(int i = 0; i < n; i++)
        {
            casa[i] = scan.nextInt();
        }
        for(int i = 0; i < m; i++)
        {
            encomenda[i] = scan.nextInt();
        }
        int result = entrega(casa, encomenda, n, m);
        
        System.out.println(result);
    }
    public static int entrega( int [] casa, int [] encomenda, int n, int m)
    {
        int cont = 0;
        int aux1 = 0;
        
        for(int i = 0; i < m; i++)
        {
            boolean test = true;
            
            for(int j = 0; j < n && test; j++)
            {
                if(casa[j] ==  encomenda[i])
                {
                    test = false;
                    int aux2 = j ;
                    
                    if(aux1 > aux2)
                    {
                        int sub = aux1 - aux2;
                        cont += sub;
                        aux1 = j;
                    }
                    else
                    {
                        int sub = aux2 - aux1;
                        cont += sub;
                        aux1 = j;
                    }
                }
            }
        }
        
        return cont;
    }
}