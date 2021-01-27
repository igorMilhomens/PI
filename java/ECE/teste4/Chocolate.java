import java.util.Scanner;

public class Chocolate
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        int l = scan.nextInt();
        
        int [] M = new int[l];
        
        for(int i = 0; i < l; i++)
        {
           
               M[i] = scan.nextInt();

        }
        int d = scan.nextInt();
        int m = scan.nextInt();
        
        int result1 = quantidade1(M, l, d, m);
       
        
        System.out.println(result1);
        
    }
    public static int quantidade1(int []M, int l, int d, int m)
    {
        int cont = 0;
        
        
        for(int j = 0; j <= l - m; j++)
        {
            int aux = 0;
            
            for(int k = 0; k < m; k++)
            {
                aux += M[j+k];
            }
            if(aux == d)
            {
                cont ++;
            }
        }
        
        
        return cont;
    }
}