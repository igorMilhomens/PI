import java.util.Scanner;

public class XzzzzPangrama
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext())
        {
            String frase = scan.nextLine();
            int cont = frase.length();
            boolean pangrama = true;

            for(int i =0; i<1 && pangrama; i++)
            {
                boolean testZ = false;
                for(int j =0; j < cont && !testZ; j++)
                {
                    testZ = true;
                    char letra = frase.charAt(j);
                    boolean compara = letra =='z' || letra =='Z' ;
                    testZ &= compara;
                }
                pangrama &= testZ;
            }
            System.out.printf("%s%n", pangrama ? "sim" : "nao");
        }
    }
}