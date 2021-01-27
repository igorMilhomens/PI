import java.util.Scanner;

public class Amuleto
{
    public static void main(String[] args)
    {
        Scanner scan= new Scanner(System.in);
        
        while(scan.hasNext())
        {
            String amuleto = scan.nextLine();
            int tam = amuleto.length();
            String espaco = " ";
            String palavraNova = amuleto;
            for (int i =1; i <= tam; i++)
            {
                char letra = amuleto.charAt(i-1);
                
                System.out.printf("%c%c", letra, i == tam ? '\n' : ' ');
            }
            for (int j =1; j < tam; j++)
            {
                palavraNova = espaco + palavraNova;
                for (int k = 1; k <= tam; k++)
                {
                    char letraNova = palavraNova.charAt(k-1);
    
                    if(letraNova == ' ')
                    {
                        System.out.printf("%c", letraNova); 
                    }
                    else
                    {
                        System.out.printf("%c%c", letraNova, k == tam ? '\n' : ' ');
                    }
                }
            }
            System.out.println();
        }
    }
}