import java.util.Scanner;

public class Jokenpo
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        String a = "pedra", b = "papel", c = "tesoura";
        
        for(int i = 0; i < test; i++)
        {
            String jogador1 = scan.next();
            String jogador2 = scan.next();
            
            if(jogador1.equals(jogador2))
            {
                System.out.println("empate");
            }
            else
            {
                if((jogador1.equals(a) && jogador2.equals(c)) || (jogador1.equals(b) && jogador2.equals(a)) || (jogador1.equals(c)&&jogador2.equals(b)))
                {
                    System.out.println("jogador 1");
                }
                else
                {
                    System.out.println("jogador 2");
                }
            }
        }
    }
}