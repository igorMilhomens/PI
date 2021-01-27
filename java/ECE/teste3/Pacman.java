import java.util.Scanner;

public class Pacman
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        String palavra;
        char c;
        char [][] M = new char[n][n];
        
        for(int i = 0; i < n; i++)
        {
            palavra = scan.next();
            
            for(int j = 0; j < n ; j++)
            {
                c =  palavra.charAt(j);
                M[i][j] = c;
            }
        }
        
        int cont = 0;
        int aux = 0;
        boolean controle = true;
        
        for(int i = 0; i < n ; i++)
        {
            if(controle)
            {
                for(int j = 0; j < n ; j++)
                {
                    if(M[i][j] == 'o')
                    {
                        cont++;
                        
                        if( aux < cont)
                        {
                            aux = cont;
                        }
                    }
                    else
                    {
                        if(M[i][j] == 'A')
                        {
                            cont = 0;
                        }
                    }
                }
            }
            else
            {
                for(int j = 0; j < n ; j++)
                {
                    if(M[i][n-1-j] == 'o')
                    {
                        cont++;
                        
                        if(aux < cont)
                        {
                            aux = cont;
                        }
                    }
                    else
                    {
                        if(M[i][n-1-j] == 'A')
                        {
                            cont = 0;
                        }
                    }
                }
            }
            
            if(controle)
            {
                controle = false;
            }
            else
            {
                controle = true;
            }
        }
        
        System.out.println(aux);
    }
}