import java.util.Scanner;

public class JokenpoSheldon
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        String a = "pedra", b = "papel", c = "tesoura", d = "lagarto", e = "spock";
        
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
                if((jogador1.equals(a) && jogador2.equals(c)) || (jogador1.equals(b) && jogador2.equals(a)) || (jogador1.equals(c)&&jogador2.equals(b)) || 
                    (jogador1.equals(a)&&jogador2.equals(d)) || (jogador1.equals(d)&&jogador2.equals(e)) || (jogador1.equals(e)&&jogador2.equals(c)) || 
                    (jogador1.equals(c)&&jogador2.equals(d)) || (jogador1.equals(d)&&jogador2.equals(b)) || (jogador1.equals(b)&&jogador2.equals(e)) ||
                    (jogador1.equals(e)&&jogador2.equals(a)))
                {
                    System.out.println("rajesh");
                }
                else
                {
                    System.out.println("sheldon");
                }
            }
        }
    }
}