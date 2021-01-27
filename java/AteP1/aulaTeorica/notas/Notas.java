import java.util.Scanner;

    public class Notas
    {
        public static void main(String[] args)
        {
            float media, nota1, nota2;
            Scanner scan = new Scanner(System.in);
            nota1 = scan.nextFloat();
            nota2 = scan.nextFloat();
            media = (nota1*nota2)/2;
            if(media >=60)
            {
            System.out.println("Aprovado");
            }
            else
            {
                if(media > 40)
                {
                    System.out.println("Exame Final");
                }
                else
                {
                    System.out.println("Reprovado");
                }
            }
        }
    }