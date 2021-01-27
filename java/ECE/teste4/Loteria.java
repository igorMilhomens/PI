import java.util.Scanner;

public class Loteria
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        
        int vet[][] = new int [n][6];
        int vet2[] = new int [6];
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < 6; j++)
            {
                vet[i][j] = scan.nextInt();
            }
        }
        
        for(int j = 0; j < 6; j++)
        {
            vet2[j] = scan.nextInt();
        }
        
        int acertos [] = contar(vet, vet2, n);
        
        
        if(acertos[0] == 0)
        {
            System.out.println("Nao houve acertador para sena");
        }
        else
        {
            System.out.println("Houve " + acertos[0] + " acertador(es) da sena");
        }
        if(acertos[1] == 0)
        {
            System.out.println("Nao houve acertador para quina");
        }
        else
        {
            System.out.println("Houve " + acertos[1] + " acertador(es) da quina");
        }
        if(acertos[2] == 0)
        {
            System.out.println("Nao houve acertador para quadra");
        }
        else
        {
            System.out.println("Houve " + acertos[2] + " acertador(es) da quadra");
        }
    } 
    public static int [] contar(int[][] vet, int[] vet2, int n)
    {
        
        int sena = 0, quina = 0, quadra = 0;
        int [] jogos =  new int [3];
        
        for(int k = 0; k < n; k++)
        {
            int contador = 0;
            
            for(int i =0; i<6 ; i++)
            {
                boolean repete = true;
                
                for(int j = 0; j < 6 && repete; j++)
                {
                    if(vet[k][j] == vet2[i])
                    {
                        repete = false;
                        contador ++;
                    }
                }
            }
            
            if(contador == 6)
            {
                sena++;
            }
            else
            {
                if(contador == 5)
                {
                    quina++;
                }
                else
                {
                    if(contador == 4)
                    {
                        quadra++;
                    }
                }
            }
        }
        
        jogos[0] = sena;
        jogos[1] = quina;
        jogos[2] = quadra;
        
        return jogos;
    }
}