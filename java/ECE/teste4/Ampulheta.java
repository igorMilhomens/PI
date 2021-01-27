import java.util.Scanner;

public class Ampulheta
{
    public static void main ( String [] args)
    {
        Scanner scan = new Scanner(System.in);
        
        
        int [][] M = new int [6][6];
        
         for(int i=0; i< 6; i++)
        {   
            for(int j = 0; j<6; j++)
            {
                M[i][j] = scan.nextInt();
            }
        }
        
        int aux = -1000;
        
        for(int i = 2; i < 6; i++)
        {
            for(int j = 2; j < 6; j++)
            {
                int cont = 0;
                
                cont = M[i-2][j-2] + M[i-2][j-1] + M[i-2][j] + M[i-1][j-1] +M[i][j-2] +M[i][j-1] + M[i][j];
                
                
                if(aux<cont)
                {
                    aux = cont;
                }
            }
        }
        
        System.out.println(aux);
    }
}
