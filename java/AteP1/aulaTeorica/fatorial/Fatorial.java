import java.util.Scanner;

public class Fatorial
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        long fatorial, contador, numero;

        numero = scan.nextInt();
        fatorial = 1;
        contador = numero;

        while(contador >= 1)
        {
            fatorial = fatorial *contador;
            contador = contador - 1;
        }
        System.out.println(fatorial);
    }
}