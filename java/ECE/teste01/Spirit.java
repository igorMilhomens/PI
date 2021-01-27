import java.util.Scanner;

public class Spirit
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String mensagem = scan.next();
        int n = mensagem.length();
        int result = (n/3);
        int contador = 0;
        
        for(int i = 1; i <= result; i++)
        {
           if(mensagem.charAt((i*3)-3)!='S')
           {
               contador++;
           }
           if(mensagem.charAt((i*3)-2)!='O')
           {
               contador++;
           }
           if(mensagem.charAt((i*3)-1)!='S')
           {
               contador++;
           }
        }
        System.out.println(contador);
    }
}