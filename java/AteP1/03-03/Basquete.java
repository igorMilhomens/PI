import java.util.Scanner;

public class Basquete
{
    public static void main(String[] args)
    {
        Scanner scan= new Scanner(System.in);
        
        int d;
        
        d = scan.nextInt();
        
        if(d<=800)
            {
                System.out.println(1);
            }
        else
        {
            if(d<=1400)
            {
                System.out.println(2);
            }
            else
            {
                if(d<=2000)
                {
                    System.out.println(3);
                }
            }
        }
    }
}
