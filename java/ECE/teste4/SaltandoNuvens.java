import java.util.Scanner;

public class SaltandoNuvens
{
    public static void main(String[] args)
    {
        Scanner scan= new Scanner(System.in);
        
        int n = scan.nextInt();
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
            aux += 2;
            if(aux == n)
            {
                aux -=1;
            }
            if(vet[aux] == 0)
            {
                cont++;
            }
            else
            {
                aux -=1;
                cont++;
            }
            
            if(aux == n-1) controle = false;
        }
        
        System.out.println(cont);
    }
    
}