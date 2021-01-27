import java.util.Scanner;

public class Palindromo
{
    public static void main(String[] args)
    {
        Scanner scan= new Scanner(System.in);
        while(scan.hasNext())
        {
            String palavra = scan.next();
            int n = palavra.length();
            boolean palindromo= true;
            for (int i =0; i<n && palindromo; i++)
            {
                boolean comparacao = palavra.charAt(i) == palavra.charAt(n-1-i);
                palindromo &= comparacao;
            }
            System.out.printf("%s%n", palindromo ? "sim" : "nao");
  
        }
    }
}  