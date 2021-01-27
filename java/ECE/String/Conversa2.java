import java.util.Scanner;

public class Conversa2
{
    public static void main(String[] args)
    {
        Scanner scan= new Scanner(System.in);
        int testes = Integer.parseInt(scan.nextLine());
        for(int i = 0; i < testes;i++)
        {
            int pessoas = Integer.parseInt(scan.nextLine());
            String lingua0 = scan.nextLine();
            boolean todosIguais= lingua0.equals(scan.nextLine());
            for(int j =2; j< pessoas; j++)
            {
                todosIguais &= scan.nextLine().equals(lingua0);
            }
            System.out.printf("%s%n", todosIguais ? lingua0 : "ingles");
        }
    }
}
