import java.util.Scanner;

public class PesoIdeal
{
    public static void main(String[] args)
    {
        float altura, peso;
        char genero;
        Scanner scan = new Scanner(System.in);
        
        altura = scan.nextFloat();
        
        do
        {
            genero = scan.next().charAt(0);
        }while(genero!='M' && genero!='F');
        
        /* continuar */
        
    }

}