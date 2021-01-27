import java.util.Scanner;

public class Palindromo
{
    public static void main(String[] args)
    {
        Scanner scan= new Scanner(System.in);
        while(scan.hasNext())
        {
            String palavra = scan.next();
            int tam = palavra.length();
            boolean palindromo = true;
            for (int i =0; i < tam && palindromo; i++)
            {
                boolean compare = palavra.charAt(i) == palavra.charAt(tam-1-i);
                palindromo &= compare;
                
            }
            if(palindromo)
            {
                System.out.println("sim");  
            }
            else
            {
                System.out.println("nao");  
            }
        }
    }
}  