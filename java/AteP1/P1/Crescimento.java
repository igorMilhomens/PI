import java.util.Scanner;

public class Crescimento
{
    public static void main(String[] args)
    {
       
        Scanner scan = new Scanner(System.in);
        int teste, i,pA,pB,anos ;
        float gA,gB;
        
        teste = scan.nextInt();
        
        for(i=0;i<teste;i++)
        {
            pA = scan.nextInt();
            pB = scan.nextInt();
            gA = scan.nextFloat();
            gB = scan.nextFloat();
            
            anos = result(pA,pB,gA,gB);
            
            if(anos<=100)
            {
                System.out.println(anos + " anos.");
            }
            else
            {
                System.out.println("Mais de 1 seculo.");
            }
        }
    }
    public static int result(float pA,float pB, float gA,float gB)
    {
        int cont=0;
        float crescA,crescB;
        
        
        while(pA<pB && cont<=100)
        {
            crescA = (pA*gA)/100;
            pA = pA + crescA ;
            crescB = (pB*gB)/100;
            pB= pB + crescB;
            cont++;
        }
        return cont;
    }
}