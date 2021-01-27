import java.util.Scanner;

public class CachorrosQuentes
{
    public static void main ( String[] args)
    {
        double cachorroQuente, participantes, media;
        
        Scanner scan = new Scanner(System.in);
        
        cachorroQuente = scan.nextInt();
        participantes = scan.nextInt();
        
        media = (cachorroQuente / participantes);
       
        System.out.printf("%.2f\n", media);
        
    }
}
 