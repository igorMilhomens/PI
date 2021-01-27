import java.util.Scanner;

public class AulaCancelada
{
    public static void main(String[] args)
    {
        Scanner scan= new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int vetor [] = new int[n];
        int contador=0;
        
        for(int i =0; i < n; i++)
        {
            vetor[i] = scan.nextInt();
            if(vetor[i]<=0)
            {
                contador ++;
            }
        }
        boolean aula = contador<k;
        
        System.out.printf("%s%n", aula ? "SIM" : "NAO" );
    }
}
