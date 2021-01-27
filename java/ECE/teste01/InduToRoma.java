import java.util.Scanner;
public class InduToRoma
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext())
        {
            int num = scan.nextInt();
            
            if(num>=1000)
            {
               int result = num/1000;
               for(int i=0; i < result; i++)
                {
                    System.out.print("M");
                }
                num = num%1000;
            }
            if(num>=900)
            {
                System.out.print("CM");
           
                num = num-900;
            }
            if(num>=500)
            {
                System.out.print("D");
                num = num-500;
            }
            if(num>=400)
            {
                System.out.print("CD");
                num = num-400;
            }
            if(num>=100)
            {
                int result = num/100; 
                for(int i = 0; i < result; i++)
                {
                    System.out.print("C");
                }
                num = num%100;
            }
            if(num>=90)
            {
                System.out.print("XC");
                num = num-90;
            }
            if(num>=50)
            {
                System.out.print("L");
                num = num-50;
            }
            if(num>=40)
            {
                System.out.print("XL");
                num = num-40;
            }
            if(num>=10)
            {
                int result = num/10;
                for(int i = 0; i < result; i++)
                {
                    System.out.print("X");
                }
                num = num%10;
            }
            if(num==9)
            {
                System.out.print("IX");
                num = num-9;
            }
            if(num>=5)
            {
                System.out.print("V");
                num = num-5;
            }
            if(num==4)
            {
                System.out.print("IV");
                num = num-4;
            }
            if(num>0)
            {
                for (int i = 0; i < num; i++)
                {
                    System.out.print("I");
                }
            }num = num-num;
            if(num==0)
            {
                System.out.println();
            }
        }
    }
}