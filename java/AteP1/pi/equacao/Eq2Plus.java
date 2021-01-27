import java.util.Scanner;

public class Eq2Plus
{
    public static void main(String[] args)
    {
        double a, b, c, delta, x1, x2;
        Scanner scan = new Scanner(System.in);

        a = scan.nextDouble();
        b = scan.nextDouble();
        c = scan.nextDouble();

        delta = b*b-4*a*c;
        if(delta > 0)
        {
            x1 = (float)(-b + Math.sqrt(delta))/(2*a);
            x2 = (float)(-b - Math.sqrt(delta))/(2*a);
            System.out.printf("%.4f %.4f\n" ,x1,x2);
        }
        else
        {
            if(delta==0)
            {
                x1 = -b/(2*a);
                System.out.printf("%.4f\n", x1);
            }
            else
            {
                System.out.println("nao ha raiz real");
            }
        }
    }
}