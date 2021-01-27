import java.util.Scanner;

public class Espelho
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        int numA, numB,a1,a2,a3,b1,b2,b3;
        
        numA = scan.nextInt();
        numB = scan.nextInt();
        
        a1 = numA / 1000;
        numA = numA % 1000;
        a2 = numA / 100;
        numA = numA % 100;
        a3 = numA / 10;
        numA = numA %10;
        
        b1 = numB / 1000;
        numB = numB % 1000;
        b2 = numB / 100;
        numB = numB % 100;
        b3 = numB / 10;
        numB = numB %10;
        
        if(a1==numB && a2==b3 && a3==b2 && numA==b1)
        {
            System.out.println("espelho");
        }
        else
        {
            System.out.println("nao espelho");
        }
    }
}