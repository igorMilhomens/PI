import java.util.Scanner;
import java.util.Arrays;

public class SegundoMaiorElemento
{
    public static void main(String[] args)
    {
        Scanner scan= new Scanner(System.in);
        
        int i, j, tamanho, contador, aux, aux1, aux2;
        
        tamanho = scan.nextInt();
        contador = 0;
        aux2 = 0;
        
        int A [] = new int [tamanho];
        int B [] = new int [tamanho];
        
        for(i = 0; i < tamanho; i++)
        {
            A [i] = scan.nextInt();
            B [i] = A[i];
        }
        
        Arrays.sort(B);
        aux = B[tamanho - 2];
        aux1 = B[tamanho - 1];
        
        if(aux == aux1)
        {
            for(i = 0; (i < tamanho) && (contador < 2); i++)
            {
               if(A[i] == aux)
               {
                   contador = contador + 1;
               }
               if( contador == 2)
               {
                   aux2 = i;
               }
            }
        }
        else
        {
            for(i = 0; (i < tamanho) && (contador < 1); i++)
            {
               if(A[i] == aux)
               {
                   contador = contador + 1;
               }
               if( contador == 1)
               {
                   aux2 = i;
               }
            }
        }
        System.out.println(aux2 + " " + A[aux2]);
    }
}