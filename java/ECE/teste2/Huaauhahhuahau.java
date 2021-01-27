import java.util.Scanner;

public class Huaauhahhuahau
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        String palavra = scan.next();
        int n = palavra.length();
        String palavraNova = "";
        
        
        for(int i = 0; i < n; i++)
        {
            char c = palavra.charAt(i);
            if(c=='a' || c =='e' || c=='i' || c == 'o' || c=='u')
            {
                palavraNova += c;
            }
        }
        
        int n1 = palavraNova.length();
        boolean palindromo = true;
        
        for(int i = 0; i < n1 && palindromo; i++)
        {
            boolean comparacao = palavraNova.charAt(i) == palavraNova.charAt(n1-1-i);
            palindromo &= comparacao;
        }
        
        System.out.printf("%s%n", palindromo ? "S" : "N");
    }
}