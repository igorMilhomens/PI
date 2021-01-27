import java.util.Scanner;

public class SaltandoNuvens2
{
    public static void main(String[] args)
    {
        Scanner scan= new Scanner(System.in);
        
        int n = scan.nextInt();
        int k = scan.nextInt();
        int vet [] = new int [n];
        
        for(int i = 0; i < n; i++)
        {
            vet[i] = scan.nextInt();
        }
        
        boolean controle = true;
        int cont = 0;
        int aux = 0;
        
        while(controle)
        { 
            aux = (aux+k)%n;
            
            if(vet[aux] == 0)
            {
                cont++;
            }
            else
            {
                
                cont+= 3;
            }
            
            if(aux == 0) controle = false;
        }
        int result = 100 - cont;
        System.out.println(result);
    }
}