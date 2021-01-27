import java.util.Scanner;

public class EliminaVogais
{
    public static void main(String[] args)
    {
      Scanner scan= new Scanner(System.in);
      
        while(scan.hasNextLine())
        {
            String palavra =scan.nextLine();
            int contador =0;
            String palavraLimpa = "";
          
            for(int i = 0; i<palavra.length(); i++)
            {
                char c = palavra.charAt(i);
                boolean eVogal =
                c == 'a' || c == 'A' ||
                c == 'e' || c == 'E' ||
                c == 'i' || c == 'I' ||
                c == 'o' || c == 'O' ||
                c == 'u' || c == 'U';
                
                if (eVogal)
                {
                    contador++;
                }
                else
                {
                    palavraLimpa +=c;    
                }
            }
            System.out.printf("%d %s %n", contador, palavraLimpa );
      
        }      
      
    }
}    
      
/*      
        Scanner scan= new Scanner(System.in);
        String vet[]= new String [250];;
        int i=0;
        
        while(scan.hasNext())
        {
            vet[i] = scan.next();
            i++;
        }
        for(int j=0; j<i;j++)
        {
            int numero = vet[j].length();
            System.out.print(numero + " ")
            for(int k=0;k<numero,k++)
            {
                char letra = vet[j].charAt(k);
                if((letra.compateTo('a') ||  )
            }
        }   
    }
}   

   String palavra = scan.nextLine();
            int tam = palavra.length();
            for (int i =1; i <= tam; i++)
            {
                char letra = palavra.charAt(i-1);
                
                System.out.printf("%c%c", letra, i == tam ? '\n' : ' ');
                
*/
