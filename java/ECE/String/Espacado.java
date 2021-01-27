import java.util.Scanner;

public class Espacado
{
    public static void main(String[] args)
    {
        Scanner scan= new Scanner(System.in);
        
        while(scan.hasNext())
        {
            String palavra = scan.nextLine();
            int tam = palavra.length();
            for (int i =1; i <= tam; i++)
            {
                char letra = palavra.charAt(i-1);
                
                System.out.printf("%c%c", letra, i == tam ? '\n' : ' ');
            }
        }
    }
}
/*
operador ternario (?) serve como um if e o (:) faz else, utilizado para fazer uma condição no printf.

System.out.printf( formato, dados de saída)
Formato obviamente descreve a saída, a saída são separadas por vírgula.

Os formatos sempre começam com “%”, e como eu disse a saída são separadas por vírgulas.

%s = String
%d = Inteiro
%f = número com ponto flutuante. Na verdade o "f" representa a vírgula.
\t = tabulação
\n = salto de linha tb pode usar %n
*/
