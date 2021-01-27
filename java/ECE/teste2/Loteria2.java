import java.util.Scanner;

public class Loteria2
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        int vet[] = new int [6];
        int vet2[] = new int [6];
        int sena = 0, quina = 0, quadra = 0;
        
        for(int i = 0; i < 6; i++)
        {
            vet[i] = scan.nextInt();
        }
        
        int n = scan.nextInt();
        
        for(int i= 0; i< n; i++)
        {
            
            for(int j = 0; j < 6; j++)
            {
                vet2[j] = scan.nextInt();
            }
            
            int acertos = contar(vet,vet2);
            
            if(acertos == 6)
            {
                sena++;
            }
            else
            {
                if(acertos == 5)
                {
                    quina++;
                }
                else
                {
                    if(acertos == 4)
                    {
                        quadra++;
                    }
                }
            }
        }
        if(sena == 0)
        {
            System.out.println("Nao houve acertador para sena");
        }
        else
        {
            System.out.println("Houve " + sena + " acertador(es) da sena");
        }
        if(quina == 0)
        {
            System.out.println("Nao houve acertador para quina");
        }
        else
        {
            System.out.println("Houve " + quina + " acertador(es) da quina");
        }
        if(quadra == 0)
        {
            System.out.println("Nao houve acertador para quadra");
        }
        else
        {
            System.out.println("Houve " + quadra + " acertador(es) da quadra");
        }
    } 
    public static int contar(int[] vet, int[] vet2)
    {
        int contador = 0;
        
        for(int i =0; i<6 ; i++)
        {
            boolean repete = true;
            for(int j = 0; j<6 && repete; j++)
            {
                if(vet[i] == vet2[j])
                {
                    repete = false;
                    contador ++;
                }
            }
        }
        return contador;
    }
}