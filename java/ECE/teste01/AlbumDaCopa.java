import java.util.Scanner;

public class AlbumDaCopa
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int c = scan.nextInt();
        int m = scan.nextInt();
        int x[] = new int[c];
        int y[] = new int[m];
        int contador = 0;
        for(int i = 0; i < c; i++)
        {
            x[i] = scan.nextInt();
        }
        for(int i = 0; i < m; i++)
        {
            y[i] = scan.nextInt();
        }
        
        for(int i =0; i<c ; i++)
        {
            boolean repete = true;
            for(int j = 0; j<m && repete; j++)
            {
                if(x[i] == y[j])
                {
                    repete = false;
                    contador ++;
                }
            }
        }
        int result = c - contador;
        System.out.println(result);
        
    }
}