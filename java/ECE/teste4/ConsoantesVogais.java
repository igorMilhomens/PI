import java.util.Scanner;

public class ConsoantesVogais
{
    public static void main ( String [] args)
    {
        Scanner scan = new Scanner(System.in);
        
        String palavra = scan.next();
        
        char c = palavra.charAt(0);
        
        boolean eVogal =
        c == 'a' || c == 'A' ||
        c == 'e' || c == 'E' ||
        c == 'i' || c == 'I' ||
        c == 'o' || c == 'O' ||
        c == 'u' || c == 'U';
        
        if (eVogal)
        {
            System.out.println("vogal");
        }
        else
        {
            System.out.println("consoante");  
        }
    }
}
