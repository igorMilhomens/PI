import java.util.Scanner;

public class Teste
{
    public static void main(String[] args)
    {
     
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();
        int o = scan.nextInt();
        
        int [] vetor = new int[o];
        
        for(int i = 0; i < 0; i++)
        {
            vetor[i] = scan.nextInt();
        }
        if (m == 0)
        {
            
        }
        else
        {
            
        }
        int t = vetor.length;
        System.out.print(t)

    }
    public static int [][] mLinha(int []vetor, int n, int o)
    {
        
    }
    
}
public static int pacman(char [][] M, int n)
    {
        boolean controle;
        int cont = 0;
        int aux = 0;
        
        for(int i = 0; i < n ; i++)
        {
            controle = true;
            
            for(int j = 0; j < n && controle; j++)
            {
                    if(M[i][j] == 'A')
                    {
                        controle = false;
                        aux = 0;
                    }
               
                aux = 0;
                
                if(M[i][j] == 'o')
                {
                    aux += 1;
                }
                else
                { }
            }
            
            cont += aux;
        }
        
        return cont;
    }