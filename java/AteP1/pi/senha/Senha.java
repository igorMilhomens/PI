import java.util.Scanner;
public class Senha
{
        public static void main(String[] args)
    {
        int senha, dig1, dig2, dig3;
        Scanner scan = new Scanner(System.in);

        senha = scan.nextInt();

        dig1 = senha/1000;
        senha = senha%1000;
        dig2 = senha/100;
        senha = senha%100;
        dig3 = senha/10;
        senha = senha%10;
        
// Este simbolo <&&> é usado para testar tabela da verdade, caso um dos valores seja falso a resposta é falso.

        if(dig1!=0 && dig2!=0 && dig3!=0 && senha!=0 )
        {
            System.out.println("SIM");
        }
        else
        {
            System.out.println("NAO");
        }
    }
}