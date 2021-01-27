import java.util.Scanner;

public class Consoantes
{
    public static void main ( String [] args)
    {
        Scanner scan = new Scanner(System.in);
        int cont =0;
        boolean test = true;
        
        while(test)
        {
            String palavra = scan.next();
            
            char c = palavra.charAt(0);
            
            if( c == '*')
            {
                test = false;
            }
            else
            {
                boolean eVogal =
                c == 'a' || c == 'A' ||
                c == 'e' || c == 'E' ||
                c == 'i' || c == 'I' ||
                c == 'o' || c == 'O' ||
                c == 'u' || c == 'U';
                
                if (!eVogal)
                {
                    cont++;
                }
            }
        }
        System.out.println(cont);
       
    }
}
