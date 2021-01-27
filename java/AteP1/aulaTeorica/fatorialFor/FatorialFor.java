import java.util.Scanner;

public class FatorialFor
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int fatorial, contador, numero;
        numero = scan.nextInt();
        fatorial = 1;
        contador = numero;
        
        for(contador=numero;contador>=1;contador=contador-1)
        {
            fatorial = fatorial * contador;
        }
        System.out.println(fatorial);
        
    }    
}