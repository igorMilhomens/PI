import java.util.Scanner;
public class Numeros
{
    public static void main(String[] args)
    {
        int n;
        Scaner scan = new Scanner(System.in);
        
        n=scan.nextInt();
        
        while(n>0)
        {
            if (numeroDoido(n))
            {
                System.out.println("OK");
                
            }
            else
            {
                System.out.println("NAO");
                
            }
            n = scan.nextInt();
        }
    }
    public static boolean numeroDoido(int num)
    {
        int primParte = num/100;
        int segParte = num%100;
        int soma = primParte+segParte;
        int somaQuad = soma*soma;
        return somaQuad == num;
    }
}