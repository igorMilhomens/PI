import java.util.Scanner;

public class AlbumDaCopa2
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int c = scan.nextInt();
        int vet[] = new int[c];

        for(int i = 0; i < c; i++)
        {
            vet[i] = scan.nextInt();
        }
        
        ordena(vet,c);
      
        int repete = 0;
        
        for(int i = 0; i < c-1; i++)
        {
            if(vet[i]==vet[i+1])
            {
                repete++;
            }
        }
       
        int result = n - (c- repete);
        
        System.out.println(result);
        
    }
     public static void ordena(int[] vet, int c)
    {
        int ordena;
        int contador = 0;
        for(int i = 0; i < c-1; i++)
        {
            for(int j = 0; j < c-i-1; j++)
            {
                if(vet[j] > vet[j+1])
                {
                    ordena = vet[j];
                    vet[j] = vet[j+1];
                    vet[j+1] = ordena;
                }
            }
        }
    }
}
